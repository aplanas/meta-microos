SUMMARY = "Small audio and MIDI framework"
DESCRIPTION = "It provides an lightweight audio & MIDI server and a fully documented \
user-space API to access either the server or directly the hardware in \
a uniform way. Sndio is designed to work for desktop applications, but \
pays special attention to synchronization mechanisms and reliability \
required by music applications. Reliability through simplicity are part \
of the project goals."
LICENSE = "ISC"

PV = "1.7.0"

RPM_NAME = "sndio-1.7.0-1.11.aarch64.rpm"
RPM_HASH = "0f393046a1b1f00e0e976cb62d31212b8f576d3b1d7de2c8a52e2a6c6b89d50f1969f79d2cff2013b53a16ceab7863856d2cc8c752ae0d6b7ff92f490a870a05"

RPROVIDES:${PN} += "sndio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libsndio.so.7.1"

inherit rpm
