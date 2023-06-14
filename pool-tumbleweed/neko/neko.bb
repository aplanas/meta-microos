SUMMARY = "A cross-platform lightweight virtual machine and language"
DESCRIPTION = "Neko VM is a virtual machine for the Neko language. Neko is a \
high-level dynamically typed programming language. It can be used as \
an embedded scripting language."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "neko-2.3.0-3.1.aarch64.rpm"
RPM_HASH = "6c23b20c254c3131b19848ae0b0890e0b934898dc1997f4ed1341f64177eb6e3589cb2108e8ee63bb35330e9b20d04ff73e137c5b4ed5dc350e3ac131e4d224c"

RPROVIDES:${PN} += "neko \
nekovm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libneko.so.2 \
libneko2 \
libpcre.so.1 \
libsqlite3.so.0 \
libz.so.1"

inherit rpm
