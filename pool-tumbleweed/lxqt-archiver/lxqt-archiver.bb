SUMMARY = "LXQt File Archiver"
DESCRIPTION = "LXQt file archiver."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "lxqt-archiver-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "ca115476014fe5fb10b7e7536999ba0ca535050f7ad1b8c359667d60dcee8c154c6852029f6d37723a30990422970b278aca86bf6a05f4bfe68ea6067e5c1c1e"

RPROVIDES:${PN} += "application() \
application(lxqt-archiver.desktop) \
lxqt-archiver \
lxqt-archiver(aarch-64) \
mimehandler(application/gzip) \
mimehandler(application/vnd.debian.binary-package) \
mimehandler(application/vnd.ms-cab-compressed) \
mimehandler(application/x-7z-compressed) \
mimehandler(application/x-7z-compressed-tar) \
mimehandler(application/x-ace) \
mimehandler(application/x-alz) \
mimehandler(application/x-ar) \
mimehandler(application/x-archive) \
mimehandler(application/x-arj) \
mimehandler(application/x-bzip) \
mimehandler(application/x-bzip-compressed-tar) \
mimehandler(application/x-bzip1) \
mimehandler(application/x-bzip1-compressed-tar) \
mimehandler(application/x-cabinet) \
mimehandler(application/x-cbr) \
mimehandler(application/x-cbz) \
mimehandler(application/x-cd-image) \
mimehandler(application/x-compress) \
mimehandler(application/x-compressed-tar) \
mimehandler(application/x-cpio) \
mimehandler(application/x-deb) \
mimehandler(application/x-ear) \
mimehandler(application/x-gtar) \
mimehandler(application/x-gzpostscript) \
mimehandler(application/x-java-archive) \
mimehandler(application/x-lha) \
mimehandler(application/x-lhz) \
mimehandler(application/x-lrzip) \
mimehandler(application/x-lrzip-compressed-tar) \
mimehandler(application/x-lzip) \
mimehandler(application/x-lzip-compressed-tar) \
mimehandler(application/x-lzma) \
mimehandler(application/x-lzma-compressed-tar) \
mimehandler(application/x-lzop) \
mimehandler(application/x-lzop-compressed-tar) \
mimehandler(application/x-ms-dos-executable) \
mimehandler(application/x-ms-wim) \
mimehandler(application/x-rar) \
mimehandler(application/x-rar-compressed) \
mimehandler(application/x-raw-disk-image) \
mimehandler(application/x-rpm) \
mimehandler(application/x-rzip) \
mimehandler(application/x-stuffit) \
mimehandler(application/x-tar) \
mimehandler(application/x-tarz) \
mimehandler(application/x-war) \
mimehandler(application/x-xz) \
mimehandler(application/x-xz-compressed-tar) \
mimehandler(application/x-zip) \
mimehandler(application/x-zip-compressed) \
mimehandler(application/x-zoo) \
mimehandler(application/x-zstd-compressed-tar) \
mimehandler(application/zip) \
mimehandler(application/zstd)"
RDEPENDS:${PN} += "bsdtar \
desktop-file-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfm-qt.so.13()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
