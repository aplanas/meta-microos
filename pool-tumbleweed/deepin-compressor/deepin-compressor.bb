SUMMARY = "Archive Manager for Deepin Desktop"
DESCRIPTION = "Archive Manager is a fast and lightweight application for creating and \
extracting archives."
LICENSE = "GPL-3.0-or-later"

PV = "5.12.13"

RPM_NAME = "deepin-compressor-5.12.13-1.3.aarch64.rpm"
RPM_HASH = "077d59fe0f27e8863a36878dc054454c1e87121c43032ec293658f68649d1679868f7bc2672c6260a5e82a9b28df185383492c822787aac8ff83c8ec68c08b19"

RPROVIDES:${PN} += "application() \
application(deepin-compressor.desktop) \
deepin-compressor \
deepin-compressor(aarch-64) \
libbz2plugin.so()(64bit) \
libcli7zplugin.so()(64bit) \
libclirarplugin.so()(64bit) \
libcompressor-interface.so()(64bit) \
libgzplugin.so()(64bit) \
liblibpigzplugin.so()(64bit) \
liblibzipplugin.so()(64bit) \
libminizipplugin.so()(64bit) \
libreadonlylibarchiveplugin.so()(64bit) \
libreadwritelibarchiveplugin.so()(64bit) \
libxzplugin.so()(64bit) \
mimehandler(application/gzip) \
mimehandler(application/vnd.android.package-archive) \
mimehandler(application/vnd.ms-cab-compressed) \
mimehandler(application/vnd.rar) \
mimehandler(application/x-7z-compressed) \
mimehandler(application/x-archive) \
mimehandler(application/x-bcpio) \
mimehandler(application/x-bzip) \
mimehandler(application/x-bzip-compressed-tar) \
mimehandler(application/x-cd-image) \
mimehandler(application/x-compress) \
mimehandler(application/x-compressed-tar) \
mimehandler(application/x-cpio) \
mimehandler(application/x-cpio-compressed) \
mimehandler(application/x-iso9660-appimage) \
mimehandler(application/x-java-archive) \
mimehandler(application/x-lrzip-compressed-tar) \
mimehandler(application/x-lz4-compressed-tar) \
mimehandler(application/x-lzip-compressed-tar) \
mimehandler(application/x-lzma) \
mimehandler(application/x-lzma-compressed-tar) \
mimehandler(application/x-rar) \
mimehandler(application/x-rpm) \
mimehandler(application/x-source-rpm) \
mimehandler(application/x-sv4cpio) \
mimehandler(application/x-sv4crc) \
mimehandler(application/x-tar) \
mimehandler(application/x-tarz) \
mimehandler(application/x-tzo) \
mimehandler(application/x-xar) \
mimehandler(application/x-xz) \
mimehandler(application/x-xz-compressed-tar) \
mimehandler(application/x-zstd-compressed-tar) \
mimehandler(application/zip)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libminizip.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libzip.so.5()(64bit)"

inherit rpm