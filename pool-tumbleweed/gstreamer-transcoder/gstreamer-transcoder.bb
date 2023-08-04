SUMMARY = "GStreamer Transcoding API"
DESCRIPTION = "GStreamer Transcoding cli tool and API"
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-transcoder-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "cbfa2f1e290484b164be959f386401533d8feacf622696d8c67a9e6ec872717d7b7f6aeadd3b5d71337f6b1cd0363bbb5254d62d7e2052e4858b7cda04b8e7e0"

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
