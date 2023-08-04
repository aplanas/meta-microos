SUMMARY = "Gtksink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the gtksink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-good-gtk-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "c1b08aec054b18d313075e546669c55f4a8075b0938f65a576dab0a170fd48c6c4734ac46eaf5c49efe2885d815e96c96fc6b2e1d0e8a97bcd5e36e3db8404d1"

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
