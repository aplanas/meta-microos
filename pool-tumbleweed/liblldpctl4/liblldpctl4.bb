SUMMARY = "Implementation of IEEE 802.1ab"
DESCRIPTION = "This package provides the shared library for lldpd. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices."
LICENSE = "MIT"

PV = "1.0.17"

RPM_NAME = "liblldpctl4-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "199758d3569d0766a47d9f224939e5b75e3fdd673b0e33451edf7eeddaf79e455ff5521af847548843524aa5cee1851dc96a716b3282025e86dbf051081179c0"

RPROVIDES:${PN} += "liblldpctl.so.4 \
liblldpctl4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6"

inherit rpm
