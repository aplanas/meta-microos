SUMMARY = "Library for gathering DiscIDs and ISRCs from audio CDs"
DESCRIPTION = "libdiscid is a C library for creating MusicBrainz and freedb DiscIDs \
from audio CDs. \
It reads a CD's table of contents (TOC) and generates an identifier \
which can be used to lookup the CD at MusicBrainz. \
Additionally, it provides a submission URL for adding the DiscID to the \
database and gathers ISRCs and the MCN from disc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.4"

RPM_NAME = "libdiscid0-0.6.4-1.2.aarch64.rpm"
RPM_HASH = "de6562d1c8497d5b25d29d56c4cda64e551fff99b36502f1e7892f1bf0dd3d8648c3a262307c4caa316ddcace844313abfd8d749f4447ca5062db2d6bf1d639f"

RPROVIDES:${PN} += "libdiscid.so.0 \
libdiscid0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
