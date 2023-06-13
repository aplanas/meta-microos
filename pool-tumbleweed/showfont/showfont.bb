SUMMARY = "Font dumper for X font server"
DESCRIPTION = "showfont displays data about a font from an X font server. \
The information shown includes font information, font properties, \
character metrics, and character bitmaps."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "showfont-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "81944947ba9cc886b489dc9978ee9744c0800f843c85decf2a6ed733a5f930f4b3f0c48b75c0430e8da3f9399cd031730b687d23d60643645cbb20c4105d491c"

RPROVIDES:${PN} += "showfont \
showfont(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFS.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
