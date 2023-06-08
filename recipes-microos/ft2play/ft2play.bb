SUMMARY = "Bit-accurate C port of Fasttracker's XM replayer"
DESCRIPTION = "Bit-accurate C port of Fasttracker's XM replayer (SB16/WAV render mode). \
This is a direct port of the original asm/Pascal source codes."
LICENSE = "BSD-3-Clause"

PV = "0~git20230215"

RPM_NAME = "ft2play-0~git20230215-1.3.aarch64.rpm"
RPM_HASH = "32f2cbeba31d8f2bb177b993f9979b1b62cabc083e78ae3d8e99c6af6098f94300a0f3cc85d836b0febc61295ebda27b4cf80b6b8d71d2ad8044a810123441c5"

RPROVIDES:${PN} += "ft2play ft2play(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
