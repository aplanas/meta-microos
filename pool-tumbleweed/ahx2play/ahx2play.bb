SUMMARY = "Bit-accurate C port of the Amiga AHX replayer"
DESCRIPTION = "Bit-accurate C port of the Amiga AHX replayer. \
This is a direct port of the original tracker source codes."
LICENSE = "BSD-3-Clause"

PV = "0~git20230215"

RPM_NAME = "ahx2play-0~git20230215-1.2.aarch64.rpm"
RPM_HASH = "499cd5a5f7fb88e653b77900761044e4111d381c102c906e3cb82163c6ac341786427604e554acb9b496be420ec1721444e9a2d9c04b0580ccefc410e7785433"

RPROVIDES:${PN} += "ahx2play \
ahx2play(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
