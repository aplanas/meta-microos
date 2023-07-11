SUMMARY = "Library to access Czech eGov system 'Datove schranky'"
DESCRIPTION = "A library for accessing ISDS (Informační system datovych schranek/ \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "GPL-3.0-or-later"

PV = "4.22.1"

RPM_NAME = "datovka-4.22.1-1.1.aarch64.rpm"
RPM_HASH = "e4d8fb4597008981ad6527a8df3d794c0541743a86f01bdf7e1e4e878472477017d705a6aedb96f97645441545f68139648fad638d80aeb920c008553e76568d"

RPROVIDES:${PN} += "datovka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libdatovka.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
qt6-sql-sqlite"

inherit rpm
