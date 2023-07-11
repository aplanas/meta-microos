SUMMARY = "GStreamer plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the GStreamer plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-gstreamer-3.6.5-8.7.aarch64.rpm"
RPM_HASH = "0c31fffba90668a4e324ce1036803c69a3f1d2d83a86f59f7923c9a168594729b2509e6d9c7ce651b727fde625a5b2b185de5d2541ae30eee1cf9f684f2182f1"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-gstreamer \
OpenSceneGraph-plugins-/usr/lib64/osgPlugins-3.6.5/osgdb-gstreamer.so \
OpenSceneGraphPlugin-ext-avi \
OpenSceneGraphPlugin-ext-mov"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenThreads.so.21 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libosg.so.161 \
libosgDB.so.161 \
libstdc++.so.6"

inherit rpm
