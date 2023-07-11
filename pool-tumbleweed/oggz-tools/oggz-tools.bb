SUMMARY = "A library that provides parsing and seeking of Ogg-files"
DESCRIPTION = "liboggz knows about Ogg speex, Ogg vorbis, Ogg theora, and the \
Ogg based Annodex formats, thus allows parsing (though not decoding) \
of these files. For getting decoding and encoding functionality you \
will require in addition libspeex, libvorbis, libtheora, and \
libannodex respectively."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "oggz-tools-1.1.1-15.29.aarch64.rpm"
RPM_HASH = "d5ac9260ea95f7b96d15a505355c4798b37fffa0095cf728bb29fbb4913124aad5ac77616f839e6c0e930e96ac376d735566fee17c2f6a3a526fecff7615a1dd"

RPROVIDES:${PN} += "oggz-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libogg.so.0 \
liboggz.so.2"

inherit rpm
