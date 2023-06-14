SUMMARY = "Graphical user interface for mkvtoolnix utils"
DESCRIPTION = "This package contains the graphical user interface for the mkvtoolnix utils."
LICENSE = "GPL-2.0-or-later"

PV = "77.0"

RPM_NAME = "mkvtoolnix-gui-77.0-1.1.aarch64.rpm"
RPM_HASH = "112dd741f5d08da0e255989c42651a9ffe27d5452f8cb98bdb0e7bf2d6b7e17658cbfc2f468a87a5f1f0c71513645db4ecf8b58906fcc34c323ac487c28a16cc"

RPROVIDES:${PN} += "mkvtoolnix-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libcmark.so.0.30.3 \
libdvdread.so.8 \
libebml.so.5 \
libfmt.so.9 \
libgcc-s.so.1 \
libgmp.so.10 \
libmatroska.so.7 \
libpugixml.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
mkvtoolnix \
qt6-multimedia"

inherit rpm
