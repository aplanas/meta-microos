SUMMARY = "Package providing R-grid graphics in R-grid"
DESCRIPTION = "This package provides R-grid, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-grid-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "8cf4971be8e5b92078f4529797e09b9dc8bec0bdf87b25e8e94cae15a4666ee8a4dd2e97204ba11bb4fe5cf8f9538f22ed568919ea6007e33be9495cfee1d303"

RPROVIDES:${PN} += "R-grid"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
