SUMMARY = "Sound File Editor"
DESCRIPTION = "Snd is a sound editor modelled loosely after Emacs and an old, \
PDP-10 sound editor named Dpysnd. It can accommodate any \
number of sounds each with any number of channels and can be customized \
and extended using guile and guile-gtk."
LICENSE = "LGPL-2.1-or-later"

PV = "23.4"

RPM_NAME = "snd-23.4-1.1.aarch64.rpm"
RPM_HASH = "9e2ab7d7dd2e04ff2cfd4c68f650901dece9fe8f7087714faf704e4e14037998244768cd2a00971663e2e274316ae91de068c491c03d0bf21c789718677f2dc4"

RPROVIDES:${PN} += "application() \
application(snd.desktop) \
snd \
snd(aarch-64)"
RDEPENDS:${PN} += "ladspa \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXm.so.4()(64bit) \
libXpm.so.4()(64bit) \
libXt.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3.so.3()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
