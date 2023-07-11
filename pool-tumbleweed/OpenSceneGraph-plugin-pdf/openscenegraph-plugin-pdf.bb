SUMMARY = "PDF plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the Poppler based PDF plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-pdf-3.6.5-8.7.aarch64.rpm"
RPM_HASH = "c0e933b89761f66c878e4b6daf84f159a324d40b947f41194bff536b1e4dfc57f8380d0dadef354196a3725357a04358e55bbba6d61cce45b928ee34c440430b"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-pdf \
OpenSceneGraph-plugins-/usr/lib64/osgPlugins-3.6.5/osgdb-pdf.so \
OpenSceneGraphPlugin-ext-pdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libosg.so.161 \
libosgDB.so.161 \
libosgWidget.so.161 \
libpoppler-glib.so.8 \
libstdc++.so.6"

inherit rpm
