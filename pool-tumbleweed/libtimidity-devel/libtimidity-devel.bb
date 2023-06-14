SUMMARY = "MIDI to WAVE converter library - Development Files"
DESCRIPTION = "This library is based on the TiMidity decoder from SDL_sound library. \
Purpose to create this library is to avoid unnecessary dependences. \
SDL_sound requires SDL and some other libraries, that not needed to \
process MIDI files. In addition libtimidity provides more suitable \
API to work with MIDI songs, it enables to specify full path to the \
timidity configuration file, and have function to retrieve meta data \
from MIDI song."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "libtimidity-devel-0.2.7-1.4.aarch64.rpm"
RPM_HASH = "7a9db26795fb54b6308e5bbaf928621640a417f28d173e05248451f92ae68d6fd61a87e0b71bedf3b68c60aa7c88aa1b949cbdc34c772eaa5f9f1809152c7433"

RPROVIDES:${PN} += "libtimidity-devel \
pkgconfig-libtimidity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtimidity2"

inherit rpm
