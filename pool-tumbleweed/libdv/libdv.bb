SUMMARY = "The Quasar DV Codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M. \
 \
This package contains the encodedv, dubdv and dvconnect tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv-1.0.0-179.6.aarch64.rpm"
RPM_HASH = "abccb8d30ce2715f76cdc87ba7a97d8e3eb893df86c0b6093d8a624f3fa1ddcb2a2dfc3d43665c6d44a9f3988aef08973447674374b230553e764e7533eb83ad"

RPROVIDES:${PN} += "libdv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdv.so.4 \
libpopt.so.0"

inherit rpm
