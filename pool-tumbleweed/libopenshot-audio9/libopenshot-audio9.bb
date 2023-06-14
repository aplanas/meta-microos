SUMMARY = "Audio library for the OpenShot video editor"
DESCRIPTION = "The OpenShot Audio Library allows editing and playback of audio. \
It was derived from the JUCE library. \
 \
This package contains the shared library."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libopenshot-audio9-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "898910bf782f4d321014990352c2dc15906759377ca9624d2623f4fd00913d9974603124d6b622aaf7449a09da3e5d276ea55bdcd28a29f6eddb2df54bc29624"

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
