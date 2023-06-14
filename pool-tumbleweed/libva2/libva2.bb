SUMMARY = "Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the core runtime library."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva2-2.18.0-2.1.aarch64.rpm"
RPM_HASH = "805dc70fafcb3f59bf9728d509dc87a43da9b6d9fc139dc35f157ce65c63d689f2091588793fa0ba2c92a6147f00886de6242ab103c9e2e6425d9f4033395897"

RPROVIDES:${PN} += "libva.so.2 \
libva2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
