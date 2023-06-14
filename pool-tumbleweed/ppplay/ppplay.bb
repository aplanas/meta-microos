SUMMARY = "Music Tracker Modules player"
DESCRIPTION = "PPPlay aims to combine a good old DOS looking interface with \
modern technologies for playing back tracker modules. \
 \
Features \
 * Module to MP3/OGG/WAV Conversion \
 * Accurate forward/backward seeking \
 * Plays XM, S3M, MOD, HSC and IMF \
 * High-accuracy OPL Emulator"
LICENSE = "GPL-3.0-or-later"

PV = "0.1.3+git20190918"

RPM_NAME = "ppplay-0.1.3+git20190918-2.2.aarch64.rpm"
RPM_HASH = "5f7ee2729be5c50567d2fcde113cad44d0ea4b6787f9b4510953172ae7f078b45634778e7f76c71667899f596db4cf672446ecb1eed030b9dbbef4d6e34dba2f"

RPROVIDES:${PN} += "ppplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libarchive.so.13 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
