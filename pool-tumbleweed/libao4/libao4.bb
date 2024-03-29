SUMMARY = "An Audio Output Library"
DESCRIPTION = "Libao is an audio output library, supporting a number of \
outputs, such as ALSA, PulseAudio, and PCM files."
LICENSE = "GPL-2.0+"

PV = "1.2.2+git20180114.d522165"

RPM_NAME = "libao4-1.2.2+git20180114.d522165-2.19.aarch64.rpm"
RPM_HASH = "93a7048294703b50f8d01a50b89cfbcf7252dc3bbf6aea85c6ffe6884719e59882feb5de30009efa9e0a8054ba2553307ba0826581191a63986bf62c9b8b0bc0"

RPROVIDES:${PN} += "libao \
libao.so.4 \
libao4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libao-plugins4 \
libc.so.6"

inherit rpm
