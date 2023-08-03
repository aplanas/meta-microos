SUMMARY = "Jack plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the jack plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-good-jack-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "b53a8787dec7f6c1e51badda68333cfc4c82abf119a149b608494799088bc12058f852851e7212426a6212bd5a74bd3c1425b01efef81cf0e487aa12f53ecc6b"

RPROVIDES:${PN} += "gstreamer-plugins-good-jack \
gstreamer1 \
libgstjack.so"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libjack.so.0"

inherit rpm
