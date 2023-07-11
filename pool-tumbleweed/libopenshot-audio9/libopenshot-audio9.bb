SUMMARY = "Audio library for the OpenShot video editor"
DESCRIPTION = "The OpenShot Audio Library allows editing and playback of audio. \
It was derived from the JUCE library. \
 \
This package contains the shared library."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libopenshot-audio9-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "cfd9baa686b09e5ab5e535ad6d841d95ffac57dcd0cf7b7b5f95611e3b03da4fd054f2df8f732976838188128f2ebf97ddf6f1fed2be2414bff90a88afef83b1"

RPROVIDES:${PN} += "libopenshot-audio.so.9 \
libopenshot-audio9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
