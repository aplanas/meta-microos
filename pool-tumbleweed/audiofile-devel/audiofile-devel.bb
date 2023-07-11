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

RPM_NAME = "audiofile-devel-0.3.6-11.21.aarch64.rpm"
RPM_HASH = "baf547f4cd1040bbb72c7d535d64dbf82821bbd0e48f0921e3971e7b765dd74d23408889f9c49b97370eec9bcd68f3d974f720b91e74792c7a853dc433f671d9"

RPROVIDES:${PN} += "audiofile-devel \
pkgconfig-audiofile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudiofile1"

inherit rpm
