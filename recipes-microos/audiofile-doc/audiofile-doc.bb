SUMMARY = "An audio file library"
DESCRIPTION = "This Audio File Library is an implementation of the SGI Audio File \
library. At present, not all features of the SGI Audio File library are \
implemented. \
 \
This library allows the processing of audio data to and from audio \
files of many common formats (currently AIFF, AIFC, WAVE, and \
NeXT/Sun)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.3.6"

RPM_NAME = "audiofile-doc-0.3.6-11.20.aarch64.rpm"
RPM_HASH = "b02dd411ba6a0304edae2c07cfa05b8aeb1a96d4cc39f48cd86d8985440ee5b088794043d77f947824fda0b5f75079897983ad16cb7a1bfa2b656ea2fda067e9"

RPROVIDES:${PN} += "audiofile-doc \
audiofile-doc(aarch-64)"
RDEPENDS:${PN} += "audiofile"

inherit rpm
