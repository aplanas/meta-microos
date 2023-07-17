SUMMARY = "A Geographic Information System (GIS)"
DESCRIPTION = "QGIS is a Geographic Information System (GIS). QGIS supports vector, \
raster, OWS and database formats. QGIS can be used to browse and \
create map data on the computer. It supports many common spatial data \
formats (e.g. ESRI ShapeFile, geotiff). QGIS supports plugins to do \
things like display tracks from a GPS."
LICENSE = "GPL-2.0-only"

PV = "3.30.3"

RPM_NAME = "qgis-3.30.3-2.1.aarch64.rpm"
RPM_HASH = "02c3f7b448db9f4803b9ed240f8788d8320370d3e52429600c399369b763c625b372bdf4856f21b6153b905271ea71aef8bd21a4c38c9ad4be1cd74ed4225c16"

RPROVIDES:${PN} += "libauthmethod-apiheader.so \
libauthmethod-awss3.so \
libauthmethod-basic.so \
libauthmethod-esritoken.so \
libauthmethod-identcert.so \
libauthmethod-maptilerhmacsha256.so \
libauthmethod-oauth2.so \
libauthmethod-pkcs12.so \
libauthmethod-pkipaths.so \
libdummy.so \
liblandingpage.so \
libplugin-geometrychecker.so \
libplugin-offlineediting.so \
libplugin-topology.so \
libprovider-arcgisfeatureserver.so \
libprovider-arcgismapserver.so \
libprovider-delimitedtext.so \
libprovider-gpx.so \
libprovider-mdal.so \
libprovider-mssql.so \
libprovider-pdal.so \
libprovider-postgres.so \
libprovider-postgresraster.so \
libprovider-spatialite.so \
libprovider-virtuallayer.so \
libprovider-virtualraster.so \
libprovider-wcs.so \
libprovider-wfs.so \
libprovider-wms.so \
libqgis-3d.so.3.30.3 \
libqgis-analysis.so.3.30.3 \
libqgis-app.so.3.30.3 \
libqgis-core.so.3.30.3 \
libqgis-gui.so.3.30.3 \
libqgis-native.so.3.30.3 \
libqgis-server.so.3.30.3 \
libqgispython.so.3.30.3 \
libqsqlspatialite.so \
libwcs.so \
libwfs.so \
libwfs3.so \
libwms.so \
libwmts.so \
qgis"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DRender.so.5 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5SerialPort.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-mysql \
libQt5Sql5-postgresql \
libQt5Sql5-sqlite \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libexiv2.so.28 \
libexpat.so.1 \
libfcgi.so.0 \
libgcc-s.so.1 \
libgdal.so.32 \
libgeos-c.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libpdal-base.so.13 \
libpdal-util.so.13 \
libpq.so.5 \
libproj.so.25 \
libprotobuf-lite.so.23.4.0 \
libpython3.11.so.1.0 \
libqca-qt5.so.2 \
libqscintilla2-qt5.so.15 \
libqt5keychain.so.1 \
libqwt-qt5.so.6.2 \
libspatialindex.so.6 \
libspatialite.so.7 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
libzip.so.5 \
libzstd.so.1 \
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
