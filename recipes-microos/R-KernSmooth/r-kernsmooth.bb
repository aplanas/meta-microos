SUMMARY = "Package provides recommended R-KernSmooth"
DESCRIPTION = "This packages provides R-KernSmooth, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.23.20"

RPM_NAME = "R-KernSmooth-2.23.20-45.1.aarch64.rpm"
RPM_HASH = "3e3f4eeb8acee62c0676b025c92d1bb241646cd724ade02a335258cae7a1d107be83e8f12eb288448ca92d7627bcd70f179c8d459648feb55d6237b40bd8728c"

RPROVIDES:${PN} += "R-KernSmooth R-KernSmooth(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libRblas.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
