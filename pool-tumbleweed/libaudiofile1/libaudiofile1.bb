SUMMARY = "An Audio File Library"
DESCRIPTION = "This audio file library is an implementation of the SGI audio file \
library. At present, not all features of the SGI audio file library are \
implemented. \
 \
This library allows the processing of audio data to and from audio \
files of many common formats (currently AIFF, AIFC, WAVE, and \
NeXT/Sun)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.3.6"

RPM_NAME = "libaudiofile1-0.3.6-11.21.aarch64.rpm"
RPM_HASH = "8459a11a11dc9614906e5333c62cd6281569666d155a52e34fc36e39c2abd3f171c44c7ca37a6d8f46d5e7ffd5148daf18b3b2741e4dca01a0f4538754a3b009"

RPROVIDES:${PN} += "libaudiofile.so.1 \
libaudiofile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
