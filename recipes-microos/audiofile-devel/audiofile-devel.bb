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

RPM_NAME = "audiofile-devel-0.3.6-11.20.aarch64.rpm"
RPM_HASH = "46b8f184f48bb57e6d16120b1aa0d60e7464aec841311efb5ca6842ba79991a03cbb0bc0eb9ef0e22f7c84bfe8fbb09bb388aee252ec9efde4cc11fbc0383a6f"

RPROVIDES:${PN} += "audiofile-devel audiofile-devel(aarch-64) pkgconfig(audiofile)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libaudiofile1"

inherit rpm
