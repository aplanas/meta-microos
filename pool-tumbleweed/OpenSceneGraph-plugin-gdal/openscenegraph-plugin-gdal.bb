SUMMARY = "GDAL plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the GDAL plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-gdal-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "997736ab1705a095ca001a21d75872b62dfa06897b6ef8ac998d77dd41a6226da4be76e42d9ae88555a941bb29b9bd83d5e19d10e1fc049553431da5d8df8328"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-gdal \
OpenSceneGraph-plugin-gdal(aarch-64) \
OpenSceneGraph-plugins:/usr/lib64/osgPlugins-3.6.5/osgdb_gdal.so \
OpenSceneGraphPlugin(ext:gdal)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libOpenThreads.so.21()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdal.so.32()(64bit) \
libm.so.6()(64bit) \
libosg.so.161()(64bit) \
libosgDB.so.161()(64bit) \
libosgTerrain.so.161()(64bit) \
libosgUtil.so.161()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
