SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libubsan1-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "7c000a426df276983ba2627b75b01aaa643820a2c24a90e9fe164d773182e8e4ac61fec2bb1765fecf42720059b7cdbc42cfccb83ab204a9b535a97a7cd952e3"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1 \
libubsan1-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
