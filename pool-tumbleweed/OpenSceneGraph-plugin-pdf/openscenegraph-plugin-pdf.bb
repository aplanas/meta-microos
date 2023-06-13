SUMMARY = "PDF plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the Poppler based PDF plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-pdf-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "b424ffc984ee9df67f9a8ef071e09356613bc3673b755419d1673932af9b4779f9fc8e5a8c967c06dbe1097b13ba5a2b462527708050c261d95edf2bef9aa81b"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-pdf \
OpenSceneGraph-plugin-pdf(aarch-64) \
OpenSceneGraph-plugins:/usr/lib64/osgPlugins-3.6.5/osgdb_pdf.so \
OpenSceneGraphPlugin(ext:pdf)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgobject-2.0.so.0()(64bit) \
libosg.so.161()(64bit) \
libosgDB.so.161()(64bit) \
libosgWidget.so.161()(64bit) \
libpoppler-glib.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
