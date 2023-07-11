SUMMARY = "Desktop Recorder"
DESCRIPTION = "recordMyDesktop is a program that captures audio and video data from a Linux \
desktop session, producing an Ogg-encapsulated Theora-Vorbis file. The main \
goal is to be as unobstrusive as possible by proccessing only regions of the \
screen that have changed."
LICENSE = "GPL-2.0"

PV = "0.4.0"

RPM_NAME = "recordmydesktop-0.4.0-1.10.aarch64.rpm"
RPM_HASH = "6b94f5a8083264c9f2d48043a6989c66649fdbeceed8e2ead3a835ba656f2b333824c883d156a6951b330add953f42260ad66539bd9c9efff06b42d417ecadc7"

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
