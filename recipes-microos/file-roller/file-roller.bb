SUMMARY = "An Archive Manager for GNOME"
DESCRIPTION = "File Roller is an archive manager for GNOME. With it, you can create \
and modify archives, view the contents of an archive, view a file \
contained in the archive, and extract files from the archive."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "file-roller-43.0-1.3.aarch64.rpm"
RPM_HASH = "3b46e27c86235545eb291de7b888857afd2997f21298b05ae727604fbd00deac992508da7d9e9933b6ad91cd5dc6b0876e864d289837c09e60c0c79794ae2f5a"

RPROVIDES:${PN} += "application() \
application(org.gnome.FileRoller.desktop) \
file-roller \
file-roller(aarch-64) \
metainfo() \
metainfo(org.gnome.FileRoller.appdata.xml) \
mimehandler(application/bzip2) \
mimehandler(application/gzip) \
mimehandler(application/vnd.android.package-archive) \
mimehandler(application/vnd.debian.binary-package) \
mimehandler(application/vnd.ms-cab-compressed) \
mimehandler(application/x-7z-compressed) \
mimehandler(application/x-7z-compressed-tar) \
mimehandler(application/x-ace) \
mimehandler(application/x-alz) \
mimehandler(application/x-apple-diskimage) \
mimehandler(application/x-ar) \
mimehandler(application/x-archive) \
mimehandler(application/x-arj) \
mimehandler(application/x-brotli) \
mimehandler(application/x-bzip) \
mimehandler(application/x-bzip-brotli-tar) \
mimehandler(application/x-bzip-compressed-tar) \
mimehandler(application/x-bzip1) \
mimehandler(application/x-bzip1-compressed-tar) \
mimehandler(application/x-cabinet) \
mimehandler(application/x-cd-image) \
mimehandler(application/x-chrome-extension) \
mimehandler(application/x-compress) \
mimehandler(application/x-compressed-tar) \
mimehandler(application/x-cpio) \
mimehandler(application/x-deb) \
mimehandler(application/x-ear) \
mimehandler(application/x-gtar) \
mimehandler(application/x-gzip) \
mimehandler(application/x-gzpostscript) \
mimehandler(application/x-java-archive) \
mimehandler(application/x-lha) \
mimehandler(application/x-lhz) \
mimehandler(application/x-lrzip) \
mimehandler(application/x-lrzip-compressed-tar) \
mimehandler(application/x-lz4) \
mimehandler(application/x-lz4-compressed-tar) \
mimehandler(application/x-lzip) \
mimehandler(application/x-lzip-compressed-tar) \
mimehandler(application/x-lzma) \
mimehandler(application/x-lzma-compressed-tar) \
mimehandler(application/x-lzop) \
mimehandler(application/x-ms-dos-executable) \
mimehandler(application/x-ms-wim) \
mimehandler(application/x-rar) \
mimehandler(application/x-rar-compressed) \
mimehandler(application/x-rpm) \
mimehandler(application/x-rzip) \
mimehandler(application/x-rzip-compressed-tar) \
mimehandler(application/x-source-rpm) \
mimehandler(application/x-stuffit) \
mimehandler(application/x-tar) \
mimehandler(application/x-tarz) \
mimehandler(application/x-tzo) \
mimehandler(application/x-war) \
mimehandler(application/x-xar) \
mimehandler(application/x-xz) \
mimehandler(application/x-xz-compressed-tar) \
mimehandler(application/x-zip) \
mimehandler(application/x-zip-compressed) \
mimehandler(application/x-zoo) \
mimehandler(application/x-zstd-compressed-tar) \
mimehandler(application/zip) \
mimehandler(application/zstd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpango-1.0.so.0()(64bit) \
libportal-gtk3.so.1()(64bit) \
libportal.so.1()(64bit)"

inherit rpm
