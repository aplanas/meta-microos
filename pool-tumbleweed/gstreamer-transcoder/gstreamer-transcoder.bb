SUMMARY = "GStreamer Transcoding API"
DESCRIPTION = "GStreamer Transcoding cli tool and API"
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-transcoder-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "618ac578f04a1a96191530916f593cb42976bb4f24a1f3d2183571bdcf937fffffda8701a794f311bf23b6990b65d119c2f852924c862ac4a7e005e6630ed2db"

RPROVIDES:${PN} += "gstreamer-transcoder \
gstreamer1 \
libgsttranscode.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttranscoder-1.0.so.0"

inherit rpm
