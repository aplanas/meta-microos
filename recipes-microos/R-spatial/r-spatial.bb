SUMMARY = "Package provides recommended R-spatial"
DESCRIPTION = "This packages provides R-spatial, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.16"

RPM_NAME = "R-spatial-7.3.16-45.1.aarch64.rpm"
RPM_HASH = "380ad8e08e80f14209c1ac905993a536016e5182e65b062808a37dbcd7549e8fa7fc396bff5bb92fb573c65ef5c5ec520c5414033e6553dbf4a5b8f047eac90f"

RPROVIDES:${PN} += "R-spatial R-spatial(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
