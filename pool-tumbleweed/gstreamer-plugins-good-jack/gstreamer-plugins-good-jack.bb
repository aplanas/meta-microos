SUMMARY = "Jack plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the jack plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-good-jack-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "bc9fd555bcae8d15ed53ad3d0b9df72a46e53a5caa6feef7ddeb8a2045c2592f3b6ac9c841cfe0ffa8397717c36d845ed352c847dac4c61dfcb18bc3fb89e35c"

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
