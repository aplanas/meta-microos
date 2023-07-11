SUMMARY = "GDAL plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the GDAL plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-gdal-3.6.5-8.7.aarch64.rpm"
RPM_HASH = "d0e601cdbe8d2c0a6fcd562811d28bb1f0c84f6979ddd0c58d37eb29374a01b5cd19c149f3dabd8a02004e98983f3b3f9ca3d77541644281f835864aded1abd4"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-gdal \
OpenSceneGraph-plugins-/usr/lib64/osgPlugins-3.6.5/osgdb-gdal.so \
OpenSceneGraphPlugin-ext-gdal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenThreads.so.21 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libm.so.6 \
libosg.so.161 \
libosgDB.so.161 \
libosgTerrain.so.161 \
libosgUtil.so.161 \
libstdc++.so.6"

inherit rpm
