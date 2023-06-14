SUMMARY = "Library for gathering DiscIDs and ISRCs from audio CDs"
DESCRIPTION = "libdiscid is a C library for creating MusicBrainz and freedb DiscIDs \
from audio CDs. \
It reads a CD's table of contents (TOC) and generates an identifier \
which can be used to lookup the CD at MusicBrainz. \
Additionally, it provides a submission URL for adding the DiscID to the \
database and gathers ISRCs and the MCN from disc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.4"

RPM_NAME = "libdiscid-devel-0.6.4-1.2.aarch64.rpm"
RPM_HASH = "90b7ab67c7f77a221b84981504a87bece516cdecf9f10cbdd23958ef80d05b80b18509c6ad901f770b2c149fe87737e2a5874ab416abff30bb461a71362bf8b8"

RPROVIDES:${PN} += "libdiscid-devel \
pkgconfig-libdiscid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdiscid0"

inherit rpm
