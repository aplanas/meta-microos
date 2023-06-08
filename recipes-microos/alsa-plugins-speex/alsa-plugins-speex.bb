SUMMARY = "Speex Prerocessor Plug-In for ALSA Library"
DESCRIPTION = "This package contains the Speex preprocessor plugin for ALSA \
library using libspeexdsp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-speex-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "b97ccf10e34d2d3315b296dae71f514287dd98ae9c774e2051d326f188fc63a3519a08da49d133b379a368f3ed66ac80053730c9c5f3499c44fbaae89f09fe3d"

RPROVIDES:${PN} += "alsa-plugins-speex alsa-plugins-speex(aarch-64) libasound_module_pcm_speex.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.17)(64bit) libspeexdsp.so.1()(64bit)"

inherit rpm
