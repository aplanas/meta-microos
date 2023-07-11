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

RPM_NAME = "ppplay-0.1.3+git20190918-2.3.aarch64.rpm"
RPM_HASH = "318094864e82296151f8e6f9a72f6aa16ffcac3ed813e0737881217ad5b076733aa22c7280e0b881b7be468ecd6da9ea73b8a72cb18c43fece8caa11a5a4d0af"

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
