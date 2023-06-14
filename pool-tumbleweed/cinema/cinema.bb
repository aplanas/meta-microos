SUMMARY = "A video player for local files"
DESCRIPTION = "A video player for watching local video files."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "cinema-1.1.2-1.24.aarch64.rpm"
RPM_HASH = "8860012d78f27fc136d57425876cac3dcc563a56dd175207a9627b4ef8a27f08af4e9d411dbfea078e856ec592ecfcb01dd403cf8333cbe886dca9ce67622e40"

RPROVIDES:${PN} += "cinema"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libsoup-2.4.so.1 \
libsqlite3.so.0"

inherit rpm
