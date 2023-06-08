SUMMARY = "GStreamer plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the GStreamer plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-gstreamer-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "03bac1173a2ada823ae8ccfb9057fe2accd3de1dbe66f710867a148583fa42d66904ba969ed4e541371b47d03728465bba17ba7179bf375c0fbb79882f85c032"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-gstreamer OpenSceneGraph-plugin-gstreamer(aarch-64) OpenSceneGraph-plugins:/usr/lib64/osgPlugins-3.6.5/osgdb_gstreamer.so OpenSceneGraphPlugin(ext:avi) OpenSceneGraphPlugin(ext:mov)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenThreads.so.21()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libosg.so.161()(64bit) libosgDB.so.161()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
