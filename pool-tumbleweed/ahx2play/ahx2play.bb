SUMMARY = "Bit-accurate C port of the Amiga AHX replayer"
DESCRIPTION = "Bit-accurate C port of the Amiga AHX replayer. \
This is a direct port of the original tracker source codes."
LICENSE = "BSD-3-Clause"

PV = "0~git20230215"

RPM_NAME = "ahx2play-0~git20230215-1.3.aarch64.rpm"
RPM_HASH = "ebe9125281b721f75fb68593c89433f21981026b8b4fd9db352c4bd0a5822281965b64ae852ba009f437e11b4178cae0766f8d322766215dbe0bb7b8f8d19948"

RPROVIDES:${PN} += "ahx2play"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
