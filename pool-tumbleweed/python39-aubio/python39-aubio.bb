SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "python39-aubio-0.4.9-9.3.aarch64.rpm"
RPM_HASH = "a0dd06d21f780d6912b6e6a1710176962424d13ec56fbeffb82facc95854eca92bcbd320d3e03839f773684eb62433f1e2b208cb55564942f1998f5a78769914"

RPROVIDES:${PN} += "python3.9dist-aubio \
python39-aubio \
python3dist-aubio"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-numpy \
update-alternatives"

inherit rpm
