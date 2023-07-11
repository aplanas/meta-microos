SUMMARY = "MPEG-2 Video Stream Decoder"
DESCRIPTION = "libmpeg2 is a library for decoding MPEG-1 and MPEG-2 video streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libmpeg2convert0-0.5.1-3.13.aarch64.rpm"
RPM_HASH = "eda6028834c2a6cf1b4c0f2ae062e5c38d0287e849f9e615cdb0f039f27878b981573828c733cf66735b8109fae72bb9e3064e4115dd1be83da73520b11f9a58"

RPROVIDES:${PN} += "libmpeg2convert.so.0 \
libmpeg2convert0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
