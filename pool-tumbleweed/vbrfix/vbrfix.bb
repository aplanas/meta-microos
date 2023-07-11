SUMMARY = "Repair MP3 files that have incorrect VBR information"
DESCRIPTION = "Many MP3 decoders estimate the time length of an MP3 file based on \
the filesize divided by the first data packet's bitrate. As songs may \
start with silence and hence a low bitrate packet, this length \
prediction can produce quite nonsensical values, and when jumping \
through a VBR file, 50% through the file is usually not 50% through \
the song. \
 \
vbrfix places a VBR null frame at the beginning of the file to tell \
the MP3 player information about the song length and indexing through \
the song. \
 \
vbrfix can also fix other problems with MP3s, as all non-MP3 content \
is deleted (you can keep tags that you state, though). It can also \
help when merging two VBR MP3s together with a merging tool and then \
needing a newly-calculated VBR null frame."
LICENSE = "GPL-2.0+"

PV = "0.24"

RPM_NAME = "vbrfix-0.24-2.21.aarch64.rpm"
RPM_HASH = "fa9989742b5a484ec78e14aebf515235ab9885037c5c24436045a948d77f1f0a5ae0a33f3055b6cc8a57964b830d756ae33beac4fb55be520e8b69170d4ef7c1"

RPROVIDES:${PN} += "vbrfix \
vbrfixc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
