SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "python311-aubio-0.4.9-9.3.aarch64.rpm"
RPM_HASH = "6ef7fe24bfb993ec1b054ca9041514d8551b3f4edecba126e036865aec2dbbe48fb720b741938df9688b5c19908b9d2e3cebf87586899a42679896030ca06e6d"

RPROVIDES:${PN} += "python3-aubio \
python3.11dist-aubio \
python311-aubio \
python3dist-aubio"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-numpy \
update-alternatives"

inherit rpm
