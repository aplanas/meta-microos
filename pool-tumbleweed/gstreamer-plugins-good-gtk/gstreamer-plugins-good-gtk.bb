SUMMARY = "Gtksink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the gtksink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-plugins-good-gtk-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "b38b5bef0a174e64c625cda5ed94a875a9b8c9ececc52b3c3105129856d430e93a2ae16c8b500b3f1a670ec4de3aa1b816f7b543e5207d884d166650ad4422a8"

RPROVIDES:${PN} += "gstreamer-plugins-good-gtk \
gstreamer1 \
libgstgtk.so"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
