SUMMARY = "A52 Output Plug-In for ALSA Library"
DESCRIPTION = "This package contains the A52 (aka AC3) output plug-in for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-a52-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "7a1847178a81e62c991f3925f1d6b2d0b78779845e57580901d870e754531fe0fc68b699252618eb5b69b93701de941c4518cd196025921b5b069657d461af16"

RPROVIDES:${PN} += "alsa-plugins-a52 \
alsa-plugins-a52(aarch-64) \
libasound_module_pcm_a52.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
