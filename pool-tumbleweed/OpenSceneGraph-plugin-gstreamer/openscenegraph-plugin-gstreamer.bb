SUMMARY = "GStreamer plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the GStreamer plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-gstreamer-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "03bac1173a2ada823ae8ccfb9057fe2accd3de1dbe66f710867a148583fa42d66904ba969ed4e541371b47d03728465bba17ba7179bf375c0fbb79882f85c032"

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
