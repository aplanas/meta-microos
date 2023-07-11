SUMMARY = "SIXEL encoder/decoder"
DESCRIPTION = "A C encoder/decoder implementation for DEC SIXEL graphics."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel1-1.10.3-1.8.aarch64.rpm"
RPM_HASH = "67399d3082ee738bd992312b9d6ab8ffc19d8942d105efae5cc3c3b267fff9125cd179dd632e5b6f20dc1e77c05860df27f55dddb96ce6c253a563a48d2a6935"

RPROVIDES:${PN} += "libsixel.so.1 \
libsixel1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgd.so.3 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6"

inherit rpm
