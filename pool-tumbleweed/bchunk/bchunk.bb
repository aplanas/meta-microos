SUMMARY = "A CD image format converter from .bin/.cue to .iso/.cdr/.wav"
DESCRIPTION = "The bchunk package contains a UNIX/C rewrite of the BinChunker \
program. BinChunker converts a CD image in a .bin/.cue format \
(sometimes .raw/.cue) into a set of .iso and .cdr/.wav tracks. \
The .bin/.cue format is used by some non-UNIX CD-writing \
software, but is not supported on most other CD-writing programs."
LICENSE = "GPL-2.0+"

PV = "1.2.2"

RPM_NAME = "bchunk-1.2.2-1.19.aarch64.rpm"
RPM_HASH = "1dd0af422817309ca89110201bf27a78718abd2347c4fec8ae04f72dc9f0c586a54ac2a3cb10df29b99b6ea3d180686ee35e77049197379a6ec33a002fb4fff0"

RPROVIDES:${PN} += "bchunk \
bchunk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
