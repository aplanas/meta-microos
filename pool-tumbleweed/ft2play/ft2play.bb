SUMMARY = "Bit-accurate C port of Fasttracker's XM replayer"
DESCRIPTION = "Bit-accurate C port of Fasttracker's XM replayer (SB16/WAV render mode). \
This is a direct port of the original asm/Pascal source codes."
LICENSE = "BSD-3-Clause"

PV = "0~git20230215"

RPM_NAME = "ft2play-0~git20230215-1.4.aarch64.rpm"
RPM_HASH = "5275f623030a88c88c68382d7f94b1b3dec1e264a27fab083babc48f9a0caf096237e72d18cdfc72ef28e4953de9818f4e1e7ebcea09e51247009d49937a0f97"

RPROVIDES:${PN} += "ft2play"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
