SUMMARY = "Library for reading media metadata (tags)"
DESCRIPTION = "libtaginfo is a convenience wrapper for taglib with C and vala \
bindings. \
 \
Features are reading/writing fields like: Artist, Album, Title, Genre, \
AlbumArtist, Comments, Disk number, Compilation flag, User labels, \
Embedded Images, Lyrics, Audio properties (length, bitrate, samplerate, \
channels ...), ..."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "libtaginfo1-0.2.1-2.5.aarch64.rpm"
RPM_HASH = "84109f2ec76d26db1dbdb0455c7bec1bfa1020dc5a8b22f6305465d78237c981a9a62ea157d47495254819e1e06277dab9c6dcdd7c578023c27283369e3c2edc"

RPROVIDES:${PN} += "libtaginfo.so.1 \
libtaginfo1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
