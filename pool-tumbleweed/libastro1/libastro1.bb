SUMMARY = "Astronomy: Shared Library"
DESCRIPTION = "The astronomy library for the satellites plugin."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libastro1-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "6467ea8d46aa7f5a870a22b5404b9634830474b79830617c8a71b345a8394bd01c5c2285c0bc69c5dfbaad0bae1d80abaed30d29849c46f362537b46702b73bb"

RPROVIDES:${PN} += "libastro-qt5-1 \
libastro.so.1 \
libastro1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmarblewidget-qt5-28 \
libstdc++.so.6"

inherit rpm
