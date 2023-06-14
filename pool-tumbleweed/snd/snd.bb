SUMMARY = "Sound File Editor"
DESCRIPTION = "Snd is a sound editor modelled loosely after Emacs and an old, \
PDP-10 sound editor named Dpysnd. It can accommodate any \
number of sounds each with any number of channels and can be customized \
and extended using guile and guile-gtk."
LICENSE = "LGPL-2.1-or-later"

PV = "23.4"

RPM_NAME = "snd-23.4-1.1.aarch64.rpm"
RPM_HASH = "9e2ab7d7dd2e04ff2cfd4c68f650901dece9fe8f7087714faf704e4e14037998244768cd2a00971663e2e274316ae91de068c491c03d0bf21c789718677f2dc4"

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
