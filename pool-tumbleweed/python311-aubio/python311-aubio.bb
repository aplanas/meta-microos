SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "python311-aubio-0.4.9-10.1.aarch64.rpm"
RPM_HASH = "3756cb19187b33f9c61ade7071a957de1e070dbca1ef979d43fa8f1adfd32fbb5eda3da41fed5f3f9e7bf6708800c053891317b9a2e2358012248402895aa50f"

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
