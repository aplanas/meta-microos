SUMMARY = "A cross-platform lightweight virtual machine and language"
DESCRIPTION = "Neko VM is a virtual machine for the Neko language. Neko is a \
high-level dynamically typed programming language. It can be used as \
an embedded scripting language."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "neko-2.3.0-3.1.aarch64.rpm"
RPM_HASH = "6c23b20c254c3131b19848ae0b0890e0b934898dc1997f4ed1341f64177eb6e3589cb2108e8ee63bb35330e9b20d04ff73e137c5b4ed5dc350e3ac131e4d224c"

RPROVIDES:${PN} += "neko \
neko(aarch-64) \
nekovm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmbedcrypto.so.7()(64bit) \
libmbedtls.so.14()(64bit) \
libmbedx509.so.1()(64bit) \
libneko.so.2()(64bit) \
libneko2 \
libpcre.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
