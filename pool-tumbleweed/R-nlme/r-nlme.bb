SUMMARY = "Package provides recommended R-nlme"
DESCRIPTION = "This packages provides R-nlme, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.1.162"

RPM_NAME = "R-nlme-3.1.162-46.1.aarch64.rpm"
RPM_HASH = "86985dd3f5ee3ac0da1b766879a2d3bcd2abc4f057bb7cb8aeaf6d46681215dce2ab2028a7e54c5850173d219a01d7db7b3ab516175eb1ee223c7b4b039d3f15"

RPROVIDES:${PN} += "R-nlme"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6 \
libm.so.6"

inherit rpm
