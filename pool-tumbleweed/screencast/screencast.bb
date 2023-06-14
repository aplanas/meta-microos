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

RPROVIDES:${PN} += "eidete \
screencast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libappindicator3.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
