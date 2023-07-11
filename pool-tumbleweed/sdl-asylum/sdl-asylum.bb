SUMMARY = "Asylum like game"
DESCRIPTION = "Young Sigmund has a few problems. To help him resolve his mental instability \
you must enter the surreal world of his inner mind and shut down the \
malfunctioning brain cells. \
 \
SDL Asylum is a C port of the computer game Asylum, which was written by Andy \
Southgate in 1994 for the Acorn Archimedes and is now public domain."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "0.3.2"

RPM_NAME = "sdl-asylum-0.3.2-3.20.aarch64.rpm"
RPM_HASH = "a06cf60332dad44f5ab5198342ebac4c81f998c65127d0fda8946597eb94a5c626490bd89edcf68b47d54f32c5f466496c28f4d4de6bae0f28902e1dce0e299d"

RPROVIDES:${PN} += "config-sdl-asylum \
sdl-asylum"

RDEPENDS:${PN} += "libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
