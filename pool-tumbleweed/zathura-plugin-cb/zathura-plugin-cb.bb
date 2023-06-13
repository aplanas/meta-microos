SUMMARY = "Comic book support for zathura"
DESCRIPTION = "The zathura-cb plugin adds comic book support to zathura."
LICENSE = "Zlib"

PV = "0.1.10"

RPM_NAME = "zathura-plugin-cb-0.1.10-1.3.aarch64.rpm"
RPM_HASH = "19f3d865813e0bafd4ae9ec3fae38b07d23be9cb6233737efc42e98e5f63ab174325f6c78214cd4ed37549d19eea6298fbd6af9d1af40d0855bc9fc3416c9720"

RPROVIDES:${PN} += "libcb.so()(64bit) \
metainfo() \
metainfo(org.pwmt.zathura-cb.metainfo.xml) \
zathura-cb-plugin \
zathura-plugin-cb \
zathura-plugin-cb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirara-gtk3.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
zathura"

inherit rpm
