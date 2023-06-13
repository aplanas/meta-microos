SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2cor18-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "5666c1069b99a0904c2cc4c7b5947c420fced941623d93f32149df99caf8c3396bbfff49d401990dccc14ebec4f2077449d2631e2b0c2ab0caaaec65fdce8e9a"

RPROVIDES:${PN} += "libm2cor.so.18()(64bit) \
libm2cor18 \
libm2cor18(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
