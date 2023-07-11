SUMMARY = "MPEG-2 Decoder"
DESCRIPTION = "An MPEG2Decoder based on the libmpeg2 libraries."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "mpeg2dec-0.5.1-3.13.aarch64.rpm"
RPM_HASH = "042f51e2e280f703f633499133040cf972b9ca870e281ca717475e40328bb65eb9cf1215ce8563d1c85c29af1559cb97aad02321e4abeb597dcc8c62ba6572e4"

RPROVIDES:${PN} += "mpeg2dec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmpeg2-0 \
libmpeg2.so.0 \
libmpeg2convert.so.0 \
libmpeg2convert0"

inherit rpm
