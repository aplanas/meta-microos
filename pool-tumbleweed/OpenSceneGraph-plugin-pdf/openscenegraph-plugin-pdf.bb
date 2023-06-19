SUMMARY = "PDF plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the Poppler based PDF plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-pdf-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "b424ffc984ee9df67f9a8ef071e09356613bc3673b755419d1673932af9b4779f9fc8e5a8c967c06dbe1097b13ba5a2b462527708050c261d95edf2bef9aa81b"

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
