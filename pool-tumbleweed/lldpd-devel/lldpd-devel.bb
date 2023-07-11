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

RPM_NAME = "lldpd-devel-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "79dc8d149e8cc158a75ac9f7407d7e7e762506ac0cefbfa6c8979acaa93d15b7a08a91e479cf4a04ef2970a706fc35fb7acfeadcd36d6c5d7b5e3544077b7759"

RPROVIDES:${PN} += "lldpd-devel \
pkgconfig-lldpctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblldpctl4"

inherit rpm
