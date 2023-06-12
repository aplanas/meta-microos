SUMMARY = "Package providing R-tcltk"
DESCRIPTION = "This package provides R-tcltk, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-tcltk-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "71e3c7c3cff20ce9cadeb0b02d3cddf8d9c19709f9d29522fba27c4404af8a3dde926f81ed6d9c6255e71e40d273f47c00fbeaf8fbd858197b6dc18910e187c5"

RPROVIDES:${PN} += "R-tcltk R-tcltk(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit)"

inherit rpm
