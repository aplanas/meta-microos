SUMMARY = "GRASS Support Libraries for QGIS"
DESCRIPTION = "GRASS plugin for QGIS required to interface with GRASS system."
LICENSE = "GPL-2.0-only"

PV = "3.32.0"

RPM_NAME = "qgis-plugin-grass-3.32.0-1.1.aarch64.rpm"
RPM_HASH = "5ef24023cd74b267f5730df96dcde7e0d9ce67a82bf706b1284abbb71ac5a1f3b95c22407592911d266a2e63a1de7ea60abf648ad1f6979e3121680cc281c045"

RPROVIDES:${PN} += "libplugin-grass8.so \
libprovider-grass8.so \
libprovider-grassraster8.so \
libqgisgrass8.so.3.32.0 \
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
libqgis-app.so.3.32.0 \
libqgis-core.so.3.32.0 \
libqgis-gui.so.3.32.0 \
libstdc++.so.6 \
qgis"

inherit rpm
