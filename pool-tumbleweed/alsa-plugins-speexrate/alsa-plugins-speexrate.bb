SUMMARY = "Rate Converter Plug-In for ALSA Library using Speex"
DESCRIPTION = "This package contains the sample rate converter plugin for ALSA \
library using Speex sample rate converter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-speexrate-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "d40ec32806c3acb4453179bb1b9fcd1115515ad3b123d8bb33c044f18c62d125362ace0a9ec0df22efb8f90c31ffa20d7c8221145a9f43ddf017687c70546ae7"

RPROVIDES:${PN} += "alsa-plugins-speexrate \
alsa-plugins-speexrate(aarch-64) \
libasound_module_rate_speexrate.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
