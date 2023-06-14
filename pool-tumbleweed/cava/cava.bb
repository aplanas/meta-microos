SUMMARY = "Console-based Audio Visualizer for Alsa"
DESCRIPTION = "C.A.V.A. is a bar spectrum audio visualizer for the Linux terminal using ALSA, pulseaudio or fifo buffer for input."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "cava-0.8.3-1.3.aarch64.rpm"
RPM_HASH = "17e4d9cffad4b811f259e39c51782b08a27964136f80a1b0a20bb3d6679d5aada4930498cbf79d942e4268b45396d4822a5e26ad73935351727e40c1a212f14e"

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
