SUMMARY = "Xviewer exif-display plugin"
DESCRIPTION = "xviewer exif display plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-exif-display-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "48096d5c17bfc9cfbc2f40586034d80dffa1b57862b90198e7cff8fdfeaa37ddd4251f3b9db8236548547810c9c3670e77ef3e4d7d1b195f380431aecf0cdc76"

RPROVIDES:${PN} += "libexif-display.so()(64bit) \
metainfo() \
metainfo(xviewer-exif-display.metainfo.xml) \
xviewer-plugin-exif-display \
xviewer-plugin-exif-display(aarch-64) \
xviewer-plugins:/usr/lib64/xviewer/plugins/exif-display.plugin"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libexif.so.12()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
xviewer-plugins-data"

inherit rpm
