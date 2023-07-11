SUMMARY = "The Quasar DV codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (a.k.a. FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv-devel-1.0.0-179.6.aarch64.rpm"
RPM_HASH = "8380e08719e5aea5ed2456779089f37d9e236055ba485b361053c0b21e9267d727339c439770619da6787f606d4ca9ae796bdbf376ffb297ef58ce07d341dba7"

RPROVIDES:${PN} += "libdv-devel \
pkgconfig-libdv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdv4"

inherit rpm
