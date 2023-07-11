SUMMARY = "Console-based Audio Visualizer for Alsa"
DESCRIPTION = "C.A.V.A. is a bar spectrum audio visualizer for the Linux terminal using ALSA, pulseaudio or fifo buffer for input."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "cava-0.8.3-1.4.aarch64.rpm"
RPM_HASH = "aa1b6fe237a01f736ddf4d411aa0cf13d34e247ae7506af70b5b6b6f3eb9dbbf454df80dabc3dd873050424523bccf6f827eb4f3a560c1ecfd71d9386b3e8268"

RPROVIDES:${PN} += "cava"

RDEPENDS:${PN} += "kbd \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfftw3.so.3 \
libiniparser.so.1 \
libm.so.6 \
libncursesw.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libtinfo.so.6"

inherit rpm
