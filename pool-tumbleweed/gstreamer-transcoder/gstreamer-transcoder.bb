SUMMARY = "GStreamer Transcoding API"
DESCRIPTION = "GStreamer Transcoding cli tool and API"
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-transcoder-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "4ff07d547663d26da42a906a7157c6c347a25ca881d2f9907eb5f73bfb6a2f5927124b89909ee19c47c12648c588f7691070d4e1068ab825edaff18839b368a3"

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
