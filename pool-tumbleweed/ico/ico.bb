SUMMARY = "Simple animation program used for testing X11 operations and extensions"
DESCRIPTION = "ico is a simple animation program that may be used for testing various \
X11 operations and extensions. It displays a wire-frame rotating \
polyhedron, with hidden lines removed, or a solid-fill polyhedron with \
hidden faces removed."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "ico-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "19ee440af7aaa16999bb828cc72dea77cdb790762c1686063aa1f1f220a060fc503ab093fe99f3ba7959e62176869f86e9ea86ec50633855238eb8329b7d7123"

RPROVIDES:${PN} += "ico \
ico(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
