SUMMARY = "Graphical user interface for mkvtoolnix utils"
DESCRIPTION = "This package contains the graphical user interface for the mkvtoolnix utils."
LICENSE = "GPL-2.0-or-later"

PV = "78.0"

RPM_NAME = "mkvtoolnix-gui-78.0-1.1.aarch64.rpm"
RPM_HASH = "c28d991b9b6e2d06e0067dd7f6794bd17517828b9bd8faffb84673b7819c99c5b53fa642b615dbac2a3bc4aaf451a966e336a56d4783a7fe2be07d0d79a889cb"

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
