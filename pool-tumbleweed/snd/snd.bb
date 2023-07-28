SUMMARY = "Sound File Editor"
DESCRIPTION = "Snd is a sound editor modelled loosely after Emacs and an old, \
PDP-10 sound editor named Dpysnd. It can accommodate any \
number of sounds each with any number of channels and can be customized \
and extended using guile and guile-gtk."
LICENSE = "LGPL-2.1-or-later"

PV = "23.5"

RPM_NAME = "snd-23.5-1.1.aarch64.rpm"
RPM_HASH = "4a55dd21cd8891bd546d2b4181018360abf1794376b7900ad86768eb90b6b0e56b6bb24ce45d4ff7ca66adefb3d662920da92ddd73015d14969638fe0762cfa4"

RPROVIDES:${PN} += "snd"

RDEPENDS:${PN} += "ladspa \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXm.so.4 \
libXpm.so.4 \
libXt.so.6 \
libasound.so.2 \
libc.so.6 \
libfftw3.so.3 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6"

inherit rpm
