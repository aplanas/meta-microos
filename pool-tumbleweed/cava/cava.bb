SUMMARY = "Console-based Audio Visualizer for Alsa"
DESCRIPTION = "C.A.V.A. is a bar spectrum audio visualizer for the Linux terminal using ALSA, pulseaudio or fifo buffer for input."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "cava-0.9.1-2.1.aarch64.rpm"
RPM_HASH = "bf32325585e0e07b86fc3bdfbe37bde5e53d61efca74a82447581221c3c98251e2feac4c2b89b6c1e3e6eb02a5ebf10c5891f5f033f0cc30f6ed8cafed33018a"

RPROVIDES:${PN} += "cava"

RDEPENDS:${PN} += "kbd \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfftw3.so.3 \
libiniparser.so.1 \
libm.so.6 \
libncursesw.so.6 \
libpipewire-0.3.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libtinfo.so.6"

inherit rpm
