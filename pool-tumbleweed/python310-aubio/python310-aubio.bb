SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "python310-aubio-0.4.9-9.1.aarch64.rpm"
RPM_HASH = "d269fa179826589e44d1c5a4f64ceda584e490c440c571bc8ae3d84fb703522247d1952b594b68b749bca04d31779376a66b33ef52047fe6e4d1d0d192d26a3f"

RPROVIDES:${PN} += "python3-aubio \
python3.10dist-aubio \
python310-aubio \
python3dist-aubio"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
