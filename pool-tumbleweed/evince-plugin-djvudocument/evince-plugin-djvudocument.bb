SUMMARY = "DjVu document support for Evince"
DESCRIPTION = "A plugin for Evince to read DjVu documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-plugin-djvudocument-44.1-1.1.aarch64.rpm"
RPM_HASH = "ece807cca023e26639019f83f2b8cf48135283f5d53ee8e219d242c8688ee49b4b358b9e15813587393b7fa8af081ee59c63349d4eaee35150eec2816323d84c"

RPROVIDES:${PN} += "evince-plugin-djvudocument \
evince-plugin-djvudocument(aarch-64) \
libdjvudocument.so()(64bit) \
metainfo() \
metainfo(evince-djvudocument.metainfo.xml)"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libdjvulibre.so.21()(64bit) \
libevdocument3.so.4()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
