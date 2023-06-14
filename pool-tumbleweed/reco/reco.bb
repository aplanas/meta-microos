SUMMARY = "Audio Recording App"
DESCRIPTION = "An audio recording app designed for elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "reco-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "e543e5394b903aaf910e64265add1fb77f4fec1ad68c2a50de533b16e1c8b2b373059ca521e08097aa9f9790bafa313e90521d2fec63f1d4d321684ffcf8eafa"

RPROVIDES:${PN} += "reco"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
