SUMMARY = "Small audio and MIDI framework"
DESCRIPTION = "It provides an lightweight audio & MIDI server and a fully documented \
user-space API to access either the server or directly the hardware in \
a uniform way. Sndio is designed to work for desktop applications, but \
pays special attention to synchronization mechanisms and reliability \
required by music applications. Reliability through simplicity are part \
of the project goals."
LICENSE = "ISC"

PV = "1.7.0"

RPM_NAME = "libsndio7_1-1.7.0-1.11.aarch64.rpm"
RPM_HASH = "8117097110c38d82565530f097e9a9906f94c2b78c817b5c5ed26f4a06cae70991836bf3f9400e148f2efd6d0c55fa61239c9c56b9e0c7647e853d3b98871984"

RPROVIDES:${PN} += "libsndio.so.7.1 \
libsndio7-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libbsd.so.0 \
libc.so.6"

inherit rpm
