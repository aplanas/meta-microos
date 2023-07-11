SUMMARY = "Audio player with remote control"
DESCRIPTION = "MuseIC is a fast and simple music player with remote control from any \
device through internet browser."
LICENSE = "GPL-3.0-only"

PV = "2.1.3"

RPM_NAME = "museic-2.1.3-1.27.aarch64.rpm"
RPM_HASH = "1fd4402c45c897458989802baff114d624e7061ae5e26cd4cb5cb1f6386360ef6eedb08a810ca4919012a5d0a50d3c46e028af1af39133de5442b04a060a0ace"

RPROVIDES:${PN} += "museic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
