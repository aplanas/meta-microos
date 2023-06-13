SUMMARY = "Package providing R-core graphics in R-graphics"
DESCRIPTION = "This package provides R-graphics, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-graphics-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "93e39bd9ce7572608f364e98a3da3e645df4c20836a855a94502c76d360e9acbec44e08e4b61030d219cd46aa497c89b750881af9604fe8b530bde0c545ed17d"

RPROVIDES:${PN} += "R-graphics \
R-graphics(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
