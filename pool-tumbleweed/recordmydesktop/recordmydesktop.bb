SUMMARY = "Desktop Recorder"
DESCRIPTION = "recordMyDesktop is a program that captures audio and video data from a Linux \
desktop session, producing an Ogg-encapsulated Theora-Vorbis file. The main \
goal is to be as unobstrusive as possible by proccessing only regions of the \
screen that have changed."
LICENSE = "GPL-2.0"

PV = "0.4.0"

RPM_NAME = "recordmydesktop-0.4.0-1.9.aarch64.rpm"
RPM_HASH = "1613f44077da49baa89bf97f94490b1273d736164376ecb1c78294ce0abaaecf76a84e31657578243b9e11b29e596f476407a4c3860fcf02731209e519f7c536"

RPROVIDES:${PN} += "recordmydesktop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libasound.so.2 \
libc.so.6 \
libjack.so.0 \
libogg.so.0 \
libpopt.so.0 \
libtheora.so.0 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libz.so.1"

inherit rpm
