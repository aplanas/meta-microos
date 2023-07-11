SUMMARY = "A Library for Manipulating ID3v1 and ID3v2 tags"
DESCRIPTION = "This package provides a software library for manipulating ID3v1 and \
ID3v2 tags. It provides a convenient interface for software developers \
to include standards-compliant ID3v1/2 tagging capabilities in their \
applications. Features include identification of valid tags, automatic \
size conversions, synchronization and resynchronization of tag frames, \
seamless tag compression and decompression, and optional padding \
facilities."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.3"

RPM_NAME = "libid3-3_8-3-3.8.3-268.10.aarch64.rpm"
RPM_HASH = "0424956a349c67be1bd6bc66202aec3ca032942e6eff2552adcebda31fda03ff6b980274a817124f0448a802fb1644c3af37feb56d8cab72e6b4412a86b64646"

RPROVIDES:${PN} += "id3lib \
libid3-3-8-3 \
libid3-3.8.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
