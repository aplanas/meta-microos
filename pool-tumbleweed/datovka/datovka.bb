SUMMARY = "Library to access Czech eGov system 'Datove schranky'"
DESCRIPTION = "A library for accessing ISDS (Informační system datovych schranek/ \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "GPL-3.0-or-later"

PV = "4.21.1"

RPM_NAME = "datovka-4.21.1-1.5.aarch64.rpm"
RPM_HASH = "b49749b4611d68ed7728a86b0f3ac25504c85ab394f79614f193785d7f740e5c251bcac74657b60e0d0868407239b6c9e9ac2159864a32f39b9d79fc371f0803"

RPROVIDES:${PN} += "application() \
application(datovka.desktop) \
datovka \
datovka(aarch-64) \
metainfo() \
metainfo(datovka.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core5Compat.so.6()(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Sql.so.6()(64bit) \
libQt6Sql.so.6(Qt_6)(64bit) \
libQt6Svg.so.6()(64bit) \
libQt6SvgWidgets.so.6()(64bit) \
libQt6WebSockets.so.6()(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libdatovka.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
qt6-sql-sqlite"

inherit rpm
