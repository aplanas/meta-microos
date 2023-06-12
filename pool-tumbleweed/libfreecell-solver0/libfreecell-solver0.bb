SUMMARY = "Freecell Solver library"
DESCRIPTION = "This package contains the Freecell Solver library which can be used by some \
programs to solves Freecell and other card games."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "libfreecell-solver0-6.8.0-1.3.aarch64.rpm"
RPM_HASH = "46073fdfb9cf3eb81dd88d05692ddca8e9e865935394c71151105af4d1b4d911f4fb59f868ce0a171131bbfeece0a8113e6e5c153352d5ba74c4e4150054fcb5"

RPROVIDES:${PN} += "libfreecell-solver.so.0()(64bit) \
libfreecell-solver0 \
libfreecell-solver0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
freecell-solver-presets \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
