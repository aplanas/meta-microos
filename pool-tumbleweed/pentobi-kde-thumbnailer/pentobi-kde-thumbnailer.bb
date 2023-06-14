SUMMARY = "KDE thumbnailer for Pentobi game files"
DESCRIPTION = "This package contains a KDE plugin to display thumbnails of \
Pentobi game files."
LICENSE = "GPL-3.0-only"

PV = "23.0"

RPM_NAME = "pentobi-kde-thumbnailer-23.0-1.3.aarch64.rpm"
RPM_HASH = "e9581a7de6e91916430104dd5ce660f7d6aad5a55de69a5013643c6242774971f09ec189a6d49318a77eee1d9e2735c34f2eff16892bad04ce0f606d7bea6b17"

RPROVIDES:${PN} += "pentobi-kde-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
