SUMMARY = "GRASS Support Libraries for QGIS"
DESCRIPTION = "GRASS plugin for QGIS required to interface with GRASS system."
LICENSE = "GPL-2.0-only"

PV = "3.30.3"

RPM_NAME = "qgis-plugin-grass-3.30.3-1.1.aarch64.rpm"
RPM_HASH = "4822513b57b687b7ce4c1f968e4ab2c72ca7b86c41df9a935d9361f819b6256c881296e52a81de1c6dd05ef59eb0c46cb2a7beb6b6b6c7b6e09f003c8f33b44c"

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
