SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libgphobos4-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "b13feef533d4150326d469f3567ef47d161371c84bde509bfe13188f947eea044d3e121ede2bcfe5e1d512052cad5ea2a46d0f7b5f4cc38bd1a8e1b1b42ecd04"

RPROVIDES:${PN} += "libgphobos.so.4()(64bit) \
libgphobos4 \
libgphobos4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
