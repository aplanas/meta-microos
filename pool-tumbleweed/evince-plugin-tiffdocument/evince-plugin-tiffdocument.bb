SUMMARY = "TIFF document support for Evince"
DESCRIPTION = "A plugin for Evince to read TIFF images."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-plugin-tiffdocument-44.1-1.1.aarch64.rpm"
RPM_HASH = "444174831a79299475c57ced8cdd32cb97c3591ef32d235703d508c919d9de2032c9df75dc40387d632acbd0dae5aff30905df2a37394e5ccb78465fc4b6c07f"

RPROVIDES:${PN} += "evince-plugin-tiffdocument \
evince-plugin-tiffdocument(aarch-64) \
libtiffdocument.so()(64bit) \
metainfo() \
metainfo(evince-tiffdocument.metainfo.xml)"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libevdocument3.so.4()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtiff.so.6()(64bit)"

inherit rpm
