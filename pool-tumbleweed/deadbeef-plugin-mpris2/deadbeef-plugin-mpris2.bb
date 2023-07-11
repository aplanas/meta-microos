SUMMARY = "MPRISv2 plugin for the DeaDBeeF music player"
DESCRIPTION = "This plugin aims to implement the MPRISv2 D-Bus interface for \
DeaDBeeF for instance to integrate DeaDBeeF into Sound Menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "deadbeef-plugin-mpris2-1.14-2.4.aarch64.rpm"
RPM_HASH = "83d73db580fa64dfe01649469d87b57a3dabf45ee3da37d57b8a77de7a7d06361fab8b391b7d2e43af0942c1f2944aa8395a48536119195cfd1749b17c0c4dda"

RPROVIDES:${PN} += "deadbeef-MPRIS-plugin \
deadbeef-mpris2-plugin \
deadbeef-plugin-mpris2"

RDEPENDS:${PN} += "deadbeef \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
