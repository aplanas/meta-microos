SUMMARY = "Bit-accurate C port of Impulse Tracker 2.15's IT replayer"
DESCRIPTION = "Bit-accurate C port of Impulse Tracker 2.15's IT replayer. \
This is a direct port of the original asm source codes."
LICENSE = "BSD-3-Clause"

PV = "0~git20230215"

RPM_NAME = "it2play-0~git20230215-1.2.aarch64.rpm"
RPM_HASH = "127766c3e9bdef7cf62ec13f086aa9d6ae1c4ff0bf92d7d932c88edc0b615f54860a9b6252c7087df2871f69aad3b6ffa25ac40197ba34aff7dc0a9961dd6cec"

RPROVIDES:${PN} += "it2play"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
