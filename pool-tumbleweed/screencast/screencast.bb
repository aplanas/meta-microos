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

RPM_NAME = "screencast-1.0.0-2.11.aarch64.rpm"
RPM_HASH = "2a66b101e4a1b82bcfdb02990914cc94a15797cda21b3e828530a6b535728035ee7d6cb051178518bf2972b84ccbe92a9c102f6d4b38ba8e6d7004c58dd4efd7"

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
