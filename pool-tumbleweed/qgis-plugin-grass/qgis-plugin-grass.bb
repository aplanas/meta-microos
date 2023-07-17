SUMMARY = "GRASS Support Libraries for QGIS"
DESCRIPTION = "GRASS plugin for QGIS required to interface with GRASS system."
LICENSE = "GPL-2.0-only"

PV = "3.30.3"

RPM_NAME = "qgis-plugin-grass-3.30.3-2.1.aarch64.rpm"
RPM_HASH = "6609a745d3036951fd722534f7cd56340abc01d90286b8e18a065d5009efaa793208955afee353be46c9526a5fcaf7a57b1d02859aff84ae005bf267c7618e96"

RPROVIDES:${PN} += "libplugin-grass8.so \
libprovider-grass8.so \
libprovider-grassraster8.so \
libqgisgrass8.so.3.30.3 \
qgis-plugin-grass"

RDEPENDS:${PN} += "/sbin/ldconfig \
grass \
grass-doc \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libgrass-dbmibase.8.2.so \
libgrass-dbmiclient.8.2.so \
libgrass-gis.8.2.so \
libgrass-gproj.8.2.so \
libgrass-imagery.8.2.so \
libgrass-raster.8.2.so \
libgrass-vector.8.2.so \
libm.so.6 \
libqgis-app.so.3.30.3 \
libqgis-core.so.3.30.3 \
libqgis-gui.so.3.30.3 \
libstdc++.so.6 \
qgis"

inherit rpm
