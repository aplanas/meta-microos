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

RPM_NAME = "audiofile-0.3.6-11.20.aarch64.rpm"
RPM_HASH = "ad3a1021c0c1d403d0127fcbbc6e1c1cd4359ca2e869846960f04fc52ec89f282766e8f8d3e8c05f75b06081a427f07b48e468ac316353937d58ef0ff8cbcd59"

RPROVIDES:${PN} += "audiofile \
audiofile(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudiofile.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
