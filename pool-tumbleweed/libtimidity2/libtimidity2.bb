SUMMARY = "MIDI to WAVE converter library"
DESCRIPTION = "This library is based on the TiMidity decoder from SDL_sound library. \
Purpose to create this library is to avoid unnecessary dependences. \
SDL_sound requires SDL and some other libraries, that not needed to \
process MIDI files. In addition libtimidity provides more suitable \
API to work with MIDI songs, it enables to specify full path to the \
timidity configuration file, and have function to retrieve meta data \
from MIDI song."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "libtimidity2-0.2.7-1.4.aarch64.rpm"
RPM_HASH = "2163b4ceef9043da56e6da3c3747dbf3da103a886031bd3b6cd862bced4622d70a75789386a11d5068b5478beaf73d8489558875b21ebda3a58983aa109f053e"

RPROVIDES:${PN} += "libtimidity.so.2 \
libtimidity2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
