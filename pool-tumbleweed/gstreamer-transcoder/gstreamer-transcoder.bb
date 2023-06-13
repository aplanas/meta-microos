SUMMARY = "GStreamer Transcoding API"
DESCRIPTION = "GStreamer Transcoding cli tool and API"
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-transcoder-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "d7c25169ce2ffd5ec8da7dd5a62e7c9a2eff16612bae950c2e5e20793bfb7a92872ae8a0e65db114404d5133980749a417fe9e273cbce9322700ef9f29b7c6c8"

RPROVIDES:${PN} += "gstreamer-transcoder \
gstreamer-transcoder(aarch-64) \
gstreamer1(element-transcodebin)()(64bit) \
gstreamer1(element-uritranscodebin)()(64bit) \
libgsttranscode.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttranscoder-1.0.so.0()(64bit)"

inherit rpm
