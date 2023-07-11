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

RPM_NAME = "audiofile-0.3.6-11.21.aarch64.rpm"
RPM_HASH = "246b43892a2b17232364c3f944a2e02d51795a9139720c5633b3395eebf42067e03cac9782dfa242d1a93517d72b993a5b9a50fc13e41381cd1477c5af1268e7"

RPROVIDES:${PN} += "audiofile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudiofile.so.1 \
libc.so.6"

inherit rpm
