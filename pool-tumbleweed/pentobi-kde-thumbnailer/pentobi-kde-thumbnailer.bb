SUMMARY = "KDE thumbnailer for Pentobi game files"
DESCRIPTION = "This package contains a KDE plugin to display thumbnails of \
Pentobi game files."
LICENSE = "GPL-3.0-only"

PV = "23.1"

RPM_NAME = "pentobi-kde-thumbnailer-23.1-1.1.aarch64.rpm"
RPM_HASH = "840c4ca94d1057b7792da51c9079326c7be9ed92999e25e4ecbd6709339f56ff85f471086c9d8eacb71baef40a8aa131ee6c84c0e14f38acf7ec28a4334952ec"

RPROVIDES:${PN} += "pentobi-kde-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
