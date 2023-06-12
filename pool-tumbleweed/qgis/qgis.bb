SUMMARY = "A Geographic Information System (GIS)"
DESCRIPTION = "QGIS is a Geographic Information System (GIS). QGIS supports vector, \
raster, OWS and database formats. QGIS can be used to browse and \
create map data on the computer. It supports many common spatial data \
formats (e.g. ESRI ShapeFile, geotiff). QGIS supports plugins to do \
things like display tracks from a GPS."
LICENSE = "GPL-2.0-only"

PV = "3.30.2"

RPM_NAME = "qgis-3.30.2-1.1.aarch64.rpm"
RPM_HASH = "3d7a8112153b9f4c6db84f07b10dfae860da27ecfea874df8b0e36544349e303648c7ce995fe79677dcf89ef8513f36aac2353a923c45a91d8eaccb4b96756d0"

RPROVIDES:${PN} += "application() \
application(qgis.desktop) \
libauthmethod_apiheader.so()(64bit) \
libauthmethod_awss3.so()(64bit) \
libauthmethod_basic.so()(64bit) \
libauthmethod_esritoken.so()(64bit) \
libauthmethod_identcert.so()(64bit) \
libauthmethod_maptilerhmacsha256.so()(64bit) \
libauthmethod_oauth2.so()(64bit) \
libauthmethod_pkcs12.so()(64bit) \
libauthmethod_pkipaths.so()(64bit) \
libdummy.so()(64bit) \
liblandingpage.so()(64bit) \
libplugin_geometrychecker.so()(64bit) \
libplugin_offlineediting.so()(64bit) \
libplugin_topology.so()(64bit) \
libprovider_arcgisfeatureserver.so()(64bit) \
libprovider_arcgismapserver.so()(64bit) \
libprovider_delimitedtext.so()(64bit) \
libprovider_gpx.so()(64bit) \
libprovider_mdal.so()(64bit) \
libprovider_mssql.so()(64bit) \
libprovider_pdal.so()(64bit) \
libprovider_postgres.so()(64bit) \
libprovider_postgresraster.so()(64bit) \
libprovider_spatialite.so()(64bit) \
libprovider_virtuallayer.so()(64bit) \
libprovider_virtualraster.so()(64bit) \
libprovider_wcs.so()(64bit) \
libprovider_wfs.so()(64bit) \
libprovider_wms.so()(64bit) \
libqgis_3d.so.3.30.2()(64bit) \
libqgis_analysis.so.3.30.2()(64bit) \
libqgis_app.so.3.30.2()(64bit) \
libqgis_core.so.3.30.2()(64bit) \
libqgis_gui.so.3.30.2()(64bit) \
libqgis_native.so.3.30.2()(64bit) \
libqgis_server.so.3.30.2()(64bit) \
libqgispython.so.3.30.2()(64bit) \
libqsqlspatialite.so()(64bit) \
libwcs.so()(64bit) \
libwfs.so()(64bit) \
libwfs3.so()(64bit) \
libwms.so()(64bit) \
libwmts.so()(64bit) \
metainfo() \
metainfo(org.qgis.qgis.appdata.xml) \
mimehandler(application/geopackage+sqlite3) \
mimehandler(application/vnd.google-earth.kml+xml) \
mimehandler(application/vnd.google-earth.kmz) \
mimehandler(application/x-esri-shape) \
mimehandler(application/x-mapinfo-mif) \
mimehandler(application/x-qgis-composer-template) \
mimehandler(application/x-qgis-layer-definition) \
mimehandler(application/x-qgis-layer-settings) \
mimehandler(application/x-qgis-project) \
mimehandler(application/x-qgis-project-container) \
mimehandler(application/x-raster-aig) \
mimehandler(application/x-raster-ecw) \
mimehandler(application/x-raster-mrsid) \
mimehandler(image/jp2) \
mimehandler(image/jpeg) \
mimehandler(image/tiff) \
qgis \
qgis(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOpenCL.so.1()(64bit) \
libOpenCL.so.1(OPENCL_1.0)(64bit) \
libOpenCL.so.1(OPENCL_1.2)(64bit) \
libOpenCL.so.1(OPENCL_2.0)(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DExtras.so.5()(64bit) \
libQt53DExtras.so.5(Qt_5)(64bit) \
libQt53DInput.so.5()(64bit) \
libQt53DInput.so.5(Qt_5)(64bit) \
libQt53DLogic.so.5()(64bit) \
libQt53DLogic.so.5(Qt_5)(64bit) \
libQt53DRender.so.5()(64bit) \
libQt53DRender.so.5(Qt_5)(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5MultimediaWidgets.so.5()(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5SerialPort.so.5()(64bit) \
libQt5SerialPort.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Sql5-mysql \
libQt5Sql5-postgresql \
libQt5Sql5-sqlite \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libexpat.so.1()(64bit) \
libfcgi.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgdal.so.32()(64bit) \
libgeos_c.so.1()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpdal_base.so.13()(64bit) \
libpdal_util.so.13()(64bit) \
libpq.so.5()(64bit) \
libproj.so.25()(64bit) \
libprotobuf-lite-3.21.12.so()(64bit) \
libpython3.10.so.1.0()(64bit) \
libqca-qt5.so.2()(64bit) \
libqscintilla2_qt5.so.15()(64bit) \
libqt5keychain.so.1()(64bit) \
libqwt-qt5.so.6.2()(64bit) \
libspatialindex.so.6()(64bit) \
libspatialite.so.7()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libzip.so.5()(64bit) \
libzstd.so.1()(64bit) \
pdal \
proj \
python3-GDAL \
python3-Jinja2 \
python3-OWSLib \
python3-PyYAML \
python3-Pygments \
python3-future \
python3-numpy \
python3-psycopg2 \
python3-qscintilla-qt5 \
python3-termcolor"

inherit rpm