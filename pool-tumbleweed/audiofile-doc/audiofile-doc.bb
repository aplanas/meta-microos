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

RPM_NAME = "audiofile-doc-0.3.6-11.21.aarch64.rpm"
RPM_HASH = "ad15e523a2ff8e81a94c7b452c3f4ab7954a83642324e085a97313cc01fbb7066eb3b58e9866ce49a7ab117f41576d104f71f83b09ec7a7addd85fd9cd812532"

RPROVIDES:${PN} += "audiofile-doc"

RDEPENDS:${PN} += "audiofile"

inherit rpm
