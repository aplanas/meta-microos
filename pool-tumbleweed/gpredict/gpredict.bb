SUMMARY = "Realtime satellite tracking and orbit prediction application"
DESCRIPTION = "Gpredict is a real-time satellite tracking and orbit prediction \
application. It can track a large number of satellites and display \
their position and other data in lists, tables, maps, and polar plots \
(radar view). Gpredict can also predict the time of future passes for a \
satellite, and provide you with detailed information about each pass."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "gpredict-2.2.1-2.15.aarch64.rpm"
RPM_HASH = "b58eff0475b589d3fd5691b463802d3557fb5b296115d4f3b027509b9e343ff854c60e9a449dedc109a474dc75590126cd39eebbc0349f8043848d8934386c49"

RPROVIDES:${PN} += "application() \
application(gpredict.desktop) \
gpredict \
gpredict(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgoocanvas-2.0.so.9()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
update-desktop-files"

inherit rpm
