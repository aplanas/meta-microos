SUMMARY = "Graphical user interface for mkvtoolnix utils"
DESCRIPTION = "This package contains the graphical user interface for the mkvtoolnix utils."
LICENSE = "GPL-2.0-or-later"

PV = "79.0"

RPM_NAME = "mkvtoolnix-gui-79.0-1.1.aarch64.rpm"
RPM_HASH = "dc50531ba5877f9e11ac377aba7ed1025e3351b79667f43397ef10925c05b4ed03a096b7a364dba23879b63eb763b2a220d5106bfbe3d8a483c450f0cc582209"

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
