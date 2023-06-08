SUMMARY = "Package provides recommended R-foreign"
DESCRIPTION = "This packages provides R-foreign, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.8.84"

RPM_NAME = "R-foreign-0.8.84-45.1.aarch64.rpm"
RPM_HASH = "13d12874c9fc568b0a219ba4526a71cb4ca66a63169575fa243d8ca23b6083a830edcd20f6a65a95bb28cf63fc3d655e1d3cabc9f32b0bb207731a688477c652"

RPROVIDES:${PN} += "R-foreign R-foreign(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
