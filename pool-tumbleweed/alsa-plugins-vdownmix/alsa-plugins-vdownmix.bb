SUMMARY = "PCM Virtual Down-mix Plug-In for ALSA Library"
DESCRIPTION = "This package contains a PCM filter plugin that performs virtual down-mixing \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-vdownmix-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "a4b1eb02e85183b22647a69616f145b961a646ec130668fe6787835190fa665d10422239f22c36902d2ace12f2ee25227381a90884d8a8acfaeec631adaa6a3c"

RPROVIDES:${PN} += "alsa-plugins-vdownmix \
libasound-module-pcm-vdownmix.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
