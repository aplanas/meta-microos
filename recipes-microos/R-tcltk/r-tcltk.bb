SUMMARY = "Package providing R-tcltk"
DESCRIPTION = "This package provides R-tcltk, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-tcltk-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "ea673f32520018c1b4fc739fdb07aa32712c6ed5cdcb254666a399711dcc0e49d050f7a27baabf2a183d7a30a81facfc78c4a7e1441832e9df02ba2f4e697ae1"

RPROVIDES:${PN} += "R-tcltk R-tcltk(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit)"

inherit rpm
