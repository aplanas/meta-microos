SUMMARY = "A Clone of the Atari 2600 Game 'Circus Atari'"
DESCRIPTION = "The object is to move a teeter-totter back and forth across the screen \
to bounce clowns into the air. When they reach the top, they pop rows \
of balloons, and then fall back down."
LICENSE = "GPL-1.0"

PV = "1.0.3"

RPM_NAME = "circuslinux-1.0.3-1285.22.aarch64.rpm"
RPM_HASH = "321dc56007951dc75f7ce50f3e6c1293a3623b861c94fbc97923ecbd2d1ddb53dbbd2e805f9e8663f76d07fd3d4703b6fc0d7fc714f62de581cdd3e438e77d3f"

RPROVIDES:${PN} += "application() \
application(circuslinux.desktop) \
circuslinux \
circuslinux(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
