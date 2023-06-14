SUMMARY = "Small audio and MIDI framework"
DESCRIPTION = "It provides an lightweight audio & MIDI server and a fully documented \
user-space API to access either the server or directly the hardware in \
a uniform way. Sndio is designed to work for desktop applications, but \
pays special attention to synchronization mechanisms and reliability \
required by music applications. Reliability through simplicity are part \
of the project goals."
LICENSE = "ISC"

PV = "1.7.0"

RPM_NAME = "sndio-1.7.0-1.10.aarch64.rpm"
RPM_HASH = "b7063a6b83ad1190f22b43ad74fe53df25bb1c72b2c467147f3ec57827cabf98c2e5ff301a47a45e12e3c02914c671c9732229f7c5efbb02d0dc4a32421d65be"

RPROVIDES:${PN} += "sndio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libsndio.so.7.1"

inherit rpm
