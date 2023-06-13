SUMMARY = "AVTP Audio Format PCM Plug-In for ALSA Library"
DESCRIPTION = "This package contains the AVTP AUdio Format (AAF) I/O plug-in \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-aaf-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "b67abe4d0c08f6a9db81ae781cd51640f96aa097b0a02603e0feac3f8cf6696435cc2c889123e9b23b6cc3fc36c469f12c8124565dec8bb84180756fd8455de4"

RPROVIDES:${PN} += "alsa-plugins-aaf \
alsa-plugins-aaf(aarch-64) \
libasound_module_pcm_aaf.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libavtp.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
