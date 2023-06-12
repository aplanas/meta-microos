SUMMARY = "Deepin File Manager"
DESCRIPTION = "Deepin File Manager is a file management tool independently  developed by Deepin \
Technology, featured with searching, copying, trash, compression/decompression, \
file property and other file management functions."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-5.6.4-3.7.aarch64.rpm"
RPM_HASH = "436745b0911634bbe1a27ab7ebdc15587e0c2d8896c6db1d94e0a66e67b2191cd491940999f83260c3c278c949a08ccf2dda5b4f05dcc26dfe579fb8ffa791b5"

RPROVIDES:${PN} += "application() \
application(dde-computer.desktop) \
application(dde-file-manager.desktop) \
application(dde-home.desktop) \
application(dde-open.desktop) \
application(dde-trash.desktop) \
deepin-file-manager \
deepin-file-manager(aarch-64) \
libdde-disk-mount-plugin.so()(64bit) \
libdde-image-preview-plugin.so()(64bit) \
libdde-music-preview-plugin.so()(64bit) \
libdde-pdf-preview-plugin.so()(64bit) \
libdde-text-preview-plugin.so()(64bit) \
libdde-video-preview-plugin.so()(64bit) \
mimehandler(inode/directory)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
deepin-shortcut-viewer \
deepin-terminal \
file-roller \
glib2-tools \
gstreamer-plugins-good \
gvfs \
libGL.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdde-file-manager.so.5()(64bit) \
libdmr.so.0.1()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libffmpegthumbnailer.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgio-qt.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjemalloc.so.2()(64bit) \
libpolkit-qt5-core-1.so.1()(64bit) \
libpoppler-cpp.so.0()(64bit) \
libqt5-dxcbplugin \
libqt5-qdbus \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtag.so.1()(64bit) \
libudisks2-qt5.so.0()(64bit) \
qt5integration \
samba \
xdg-user-dirs"

inherit rpm
