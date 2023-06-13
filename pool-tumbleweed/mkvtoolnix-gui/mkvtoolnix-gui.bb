SUMMARY = "Graphical user interface for mkvtoolnix utils"
DESCRIPTION = "This package contains the graphical user interface for the mkvtoolnix utils."
LICENSE = "GPL-2.0-or-later"

PV = "77.0"

RPM_NAME = "mkvtoolnix-gui-77.0-1.1.aarch64.rpm"
RPM_HASH = "112dd741f5d08da0e255989c42651a9ffe27d5452f8cb98bdb0e7bf2d6b7e17658cbfc2f468a87a5f1f0c71513645db4ecf8b58906fcc34c323ac487c28a16cc"

RPROVIDES:${PN} += "application() \
application(org.bunkus.mkvtoolnix-gui.desktop) \
metainfo() \
metainfo(org.bunkus.mkvtoolnix-gui.appdata.xml) \
mimehandler(application/x-mkvtoolnix-gui-settings) \
mimehandler(audio/webm) \
mimehandler(audio/x-matroska) \
mimehandler(video/webm) \
mimehandler(video/x-matroska) \
mimehandler(video/x-matroska-3d) \
mkvtoolnix-gui \
mkvtoolnix-gui(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFLAC.so.12()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Multimedia.so.6()(64bit) \
libQt6Multimedia.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcmark.so.0.30.3()(64bit) \
libdvdread.so.8()(64bit) \
libebml.so.5()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libmatroska.so.7()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvorbis.so.0()(64bit) \
mkvtoolnix \
qt6-multimedia"

inherit rpm
