SUMMARY = "GDAL plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the GDAL plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-gdal-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "997736ab1705a095ca001a21d75872b62dfa06897b6ef8ac998d77dd41a6226da4be76e42d9ae88555a941bb29b9bd83d5e19d10e1fc049553431da5d8df8328"

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
