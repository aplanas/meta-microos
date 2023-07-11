SUMMARY = "Package providing R-methods"
DESCRIPTION = "This package provides R-methods, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-methods-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "793d9d45ba37a65d5585d7e22f47df8164ba99a720831d45c42c2812fafab0e5f0932da86e3186b1da61c62cfd33a4d8537a6aacbc29ebcda113159962d54457"

RPROVIDES:${PN} += "R-methods"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
