SUMMARY = "A C++ library for terminal based user interfaces"
DESCRIPTION = "A C++ library for terminal based user interfaces."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "libftxui4_1_0-4.1.1-1.1.aarch64.rpm"
RPM_HASH = "55607bc425868c0626afba6d5b66a9ef282eb65fd7c4d8313e388dc37876b13cc2451501715499cca524a775364a7a711f7751df5e385febb406571473bfa29a"

RPROVIDES:${PN} += "libftxui-component.so.4.1.0 \
libftxui-dom.so.4.1.0 \
libftxui-screen.so.4.1.0 \
libftxui4-1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
