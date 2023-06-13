SUMMARY = "A screencasting application"
DESCRIPTION = "A screencasting application for Elementary OS. \
 \
Current features: \
  * encoding to WebM \
  * selection of the area to be recorded \
  * display of the pressed keys \
  * audio recording"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "screencast-1.0.0-2.10.aarch64.rpm"
RPM_HASH = "43baf02cbc0c05bd88c8510d2d3d351b515bebf99dea9956b0c9aafac05863231c14d800f75bdd283d1b5ed6fbd3f9491c921afb5e7e0055235b4c74b636f917"

RPROVIDES:${PN} += "application() \
application(com.github.artemanufrij.screencast.desktop) \
eidete \
metainfo() \
metainfo(com.github.artemanufrij.screencast.appdata.xml) \
screencast \
screencast(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libappindicator3.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
