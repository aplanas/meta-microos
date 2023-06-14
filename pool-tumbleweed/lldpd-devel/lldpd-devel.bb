SUMMARY = "Headers for the lldpd implementation"
DESCRIPTION = "This package is required to develop alternate clients for lldpd. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices."
LICENSE = "MIT"

PV = "1.0.17"

RPM_NAME = "lldpd-devel-1.0.17-1.1.aarch64.rpm"
RPM_HASH = "b8370cdaf4633596a9204c155c755d3f0d6bc19b3837f31cf6ea81dbea8756a6f9056115204cf567116c925fc794f71645c0d220b55ea990d2ebf8822a2371a0"

RPROVIDES:${PN} += "lldpd-devel \
pkgconfig-lldpctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblldpctl4"

inherit rpm
