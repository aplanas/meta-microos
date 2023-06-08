SUMMARY = "MATE Desktop archive manager"
DESCRIPTION = "Engrampa is an archive manager for the MATE Desktop Environment. \
This means that you can create and modify archives; view the \
content of an archive; view and modify a file contained in the \
archive; extract files from the archive."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "engrampa-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "63b01c850c9fc7d0844512dd0f120b9255283f7376a3d2f94230902869569a8772623975aa425cc2936571d0417851ad3e00d57113a2f07a686408d963836227"

RPROVIDES:${PN} += "application() application(engrampa.desktop) engrampa engrampa(aarch-64) mate-file-archiver metainfo() metainfo(engrampa.appdata.xml) mimehandler(application/epub+zip) mimehandler(application/vnd.debian.binary-package) mimehandler(application/vnd.ms-cab-compressed) mimehandler(application/x-7z-compressed) mimehandler(application/x-7z-compressed-tar) mimehandler(application/x-ace) mimehandler(application/x-alz) mimehandler(application/x-arc) mimehandler(application/x-archive) mimehandler(application/x-arj) mimehandler(application/x-brotli) mimehandler(application/x-brotli-compressed-tar) mimehandler(application/x-bzip) mimehandler(application/x-bzip-compressed-tar) mimehandler(application/x-bzip1) mimehandler(application/x-bzip1-compressed-tar) mimehandler(application/x-cabinet) mimehandler(application/x-cbr) mimehandler(application/x-cbz) mimehandler(application/x-cd-image) mimehandler(application/x-compress) mimehandler(application/x-compressed-tar) mimehandler(application/x-cpio) mimehandler(application/x-ear) mimehandler(application/x-gtar) mimehandler(application/x-gzip) mimehandler(application/x-gzpostscript) mimehandler(application/x-java-archive) mimehandler(application/x-lha) mimehandler(application/x-lrzip) mimehandler(application/x-lrzip-compressed-tar) mimehandler(application/x-lzh-compressed) mimehandler(application/x-lzip) mimehandler(application/x-lzip-compressed-tar) mimehandler(application/x-lzma) mimehandler(application/x-lzma-compressed-tar) mimehandler(application/x-lzop) mimehandler(application/x-lzop-compressed-tar) mimehandler(application/x-ms-dos-executable) mimehandler(application/x-ms-wim) mimehandler(application/x-rar) mimehandler(application/x-rar-compressed) mimehandler(application/x-rpm) mimehandler(application/x-rzip) mimehandler(application/x-source-rpm) mimehandler(application/x-stuffit) mimehandler(application/x-tar) mimehandler(application/x-tarz) mimehandler(application/x-war) mimehandler(application/x-xz) mimehandler(application/x-xz-compressed-tar) mimehandler(application/x-zip) mimehandler(application/x-zip-compressed) mimehandler(application/x-zoo) mimehandler(application/x-zstd-compressed-tar) mimehandler(application/zip) mimehandler(application/zstd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
