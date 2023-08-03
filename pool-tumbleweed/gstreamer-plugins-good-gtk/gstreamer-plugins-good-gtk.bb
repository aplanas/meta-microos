SUMMARY = "Gtksink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the gtksink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-good-gtk-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "beda59af25352cff566e6c3e9f7e111212a33f793a9116baf6baa0b11368e9865814ca212d71ba0ea536421114233b76530504e9118e039edd44009c1ca49f46"

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
