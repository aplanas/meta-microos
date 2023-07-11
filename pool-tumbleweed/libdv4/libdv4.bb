SUMMARY = "The Quasar DV Codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv4-1.0.0-179.6.aarch64.rpm"
RPM_HASH = "3f42f33373d45d64c6c9b8dc214f870d8736a4807fd8f4826cf62bdaf14224f337d41e1358b4fb7582d016a63aec1c95639a864e627820ecd9ebe2128f56756e"

RPROVIDES:${PN} += "libdv.so.4 \
libdv4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
