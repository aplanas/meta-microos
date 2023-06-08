SUMMARY = "Package provides recommended R-nnet"
DESCRIPTION = "This packages provides R-nnet, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.18"

RPM_NAME = "R-nnet-7.3.18-45.1.aarch64.rpm"
RPM_HASH = "e6c4bc4cc128ba36c3ac9513efb04989c99638c38b72df3fef18ba4a9a3d370791178cd5013e9451b7a233743bf0c5173ab70c34ddc16cbc1315d3027566aeaf"

RPROVIDES:${PN} += "R-nnet R-nnet(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
