SUMMARY = "PostScript document support for Evince"
DESCRIPTION = "A plugin for Evince to read PostScript documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-plugin-psdocument-44.1-1.1.aarch64.rpm"
RPM_HASH = "c279621520d670d28b12d76031c3093d330265d0e08d151a3b9260c68f4519f1e8ea9da1db1627fe4c2648536d5b047fafd8013a5a3d2f7a44023355a8db9361"

RPROVIDES:${PN} += "evince-plugin-psdocument \
evince-plugin-psdocument(aarch-64) \
libpsdocument.so()(64bit) \
metainfo() \
metainfo(evince-psdocument.metainfo.xml)"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libevdocument3.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libspectre.so.1()(64bit)"

inherit rpm
