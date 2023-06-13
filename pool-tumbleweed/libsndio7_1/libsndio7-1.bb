SUMMARY = "Small audio and MIDI framework"
DESCRIPTION = "It provides an lightweight audio & MIDI server and a fully documented \
user-space API to access either the server or directly the hardware in \
a uniform way. Sndio is designed to work for desktop applications, but \
pays special attention to synchronization mechanisms and reliability \
required by music applications. Reliability through simplicity are part \
of the project goals."
LICENSE = "ISC"

PV = "1.7.0"

RPM_NAME = "libsndio7_1-1.7.0-1.10.aarch64.rpm"
RPM_HASH = "c9847e26f72c546109bc9e373f945652e895585aca58e5457e02c21f8e28fc073931b73657c3e66f7fa086d4923122f231deed6ad591690679b489fae59de1ae"

RPROVIDES:${PN} += "libsndio.so.7.1()(64bit) \
libsndio7_1 \
libsndio7_1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libbsd.so.0()(64bit) \
libbsd.so.0(LIBBSD_0.0)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
