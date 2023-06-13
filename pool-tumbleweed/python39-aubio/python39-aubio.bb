SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "python39-aubio-0.4.9-9.1.aarch64.rpm"
RPM_HASH = "2a22164cd6c4ae556c807069f0705413b4b93c7dad1ed2981f4117c4a408615bd983a5657e1fb328b2832bd82bbe557b2a4dc0a19d11636b591518ecc8b7257e"

RPROVIDES:${PN} += "python3.9dist(aubio) \
python39-aubio \
python39-aubio(aarch-64) \
python3dist(aubio)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-numpy \
update-alternatives"

inherit rpm
