SUMMARY = "Deepin File Manager"
DESCRIPTION = "Deepin File Manager is a file management tool independently  developed by Deepin \
Technology, featured with searching, copying, trash, compression/decompression, \
file property and other file management functions."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-5.6.4-3.7.aarch64.rpm"
RPM_HASH = "436745b0911634bbe1a27ab7ebdc15587e0c2d8896c6db1d94e0a66e67b2191cd491940999f83260c3c278c949a08ccf2dda5b4f05dcc26dfe579fb8ffa791b5"

RPROVIDES:${PN} += "deepin-file-manager \
libdde-disk-mount-plugin.so \
libdde-image-preview-plugin.so \
libdde-music-preview-plugin.so \
libdde-pdf-preview-plugin.so \
libdde-text-preview-plugin.so \
libdde-video-preview-plugin.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
deepin-shortcut-viewer \
deepin-terminal \
file-roller \
glib2-tools \
gstreamer-plugins-good \
gvfs \
libGL.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdde-file-manager.so.5 \
libdmr.so.0.1 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libffmpegthumbnailer.so.4 \
libgcc-s.so.1 \
libgio-qt.so.0 \
libgobject-2.0.so.0 \
libjemalloc.so.2 \
libpolkit-qt5-core-1.so.1 \
libpoppler-cpp.so.0 \
libqt5-dxcbplugin \
libqt5-qdbus \
libstdc++.so.6 \
libtag.so.1 \
libudisks2-qt5.so.0 \
qt5integration \
samba \
xdg-user-dirs"

inherit rpm
