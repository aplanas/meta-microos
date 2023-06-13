SUMMARY = "GRASS Support Libraries for QGIS"
DESCRIPTION = "GRASS plugin for QGIS required to interface with GRASS system."
LICENSE = "GPL-2.0-only"

PV = "3.30.2"

RPM_NAME = "qgis-plugin-grass-3.30.2-1.1.aarch64.rpm"
RPM_HASH = "194381184a1b9c8990dc796077aa2170dcefdebf619ca5d0884635f74d6b68c6c74395b86a3575b1fbf1f0c489e7044b5c6f88ef034e4464e2bc418e0bfa5405"

RPROVIDES:${PN} += "libplugin_grass8.so()(64bit) \
libprovider_grass8.so()(64bit) \
libprovider_grassraster8.so()(64bit) \
libqgisgrass8.so.3.30.2()(64bit) \
qgis-plugin-grass \
qgis-plugin-grass(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
grass \
grass-doc \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdal.so.32()(64bit) \
libgrass_dbmibase.8.2.so()(64bit) \
libgrass_dbmiclient.8.2.so()(64bit) \
libgrass_gis.8.2.so()(64bit) \
libgrass_gproj.8.2.so()(64bit) \
libgrass_imagery.8.2.so()(64bit) \
libgrass_raster.8.2.so()(64bit) \
libgrass_vector.8.2.so()(64bit) \
libm.so.6()(64bit) \
libqgis_app.so.3.30.2()(64bit) \
libqgis_core.so.3.30.2()(64bit) \
libqgis_gui.so.3.30.2()(64bit) \
libstdc++.so.6()(64bit) \
qgis"

inherit rpm
