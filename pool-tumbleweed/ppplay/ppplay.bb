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

RPROVIDES:${PN} += "application() \
application(ppplay.desktop) \
mimehandler(audio/x-hsc) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-xm) \
ppplay \
ppplay(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libarchive.so.13()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libboost_serialization.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
