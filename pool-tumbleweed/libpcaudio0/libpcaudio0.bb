SUMMARY = "Cross platform audio library"
DESCRIPTION = "The Portable C Audio Library (pcaudiolib) provides a C API to different audio devices."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libpcaudio0-1.2-1.5.aarch64.rpm"
RPM_HASH = "8bcc6ec1eabb3650970cf278a0d51196a2de0b006002500064627b2842e21cfd37a5b477c3d095ca745296faade5aee2eae165b54d791cd1061f7eda2b1530db"

RPROVIDES:${PN} += "libpcaudio.so.0 \
libpcaudio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
