SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "python310-aubio-0.4.9-9.3.aarch64.rpm"
RPM_HASH = "de7b86f31b0e8fd574dec7ef35d4fcedfe04c37b5d736c0785cceac0beb1b3941df51dc160c4e07ddc0bc41ebdf6678793bbcd620c0d22d2ebd50357ac2c1b62"

RPROVIDES:${PN} += "python3.10dist-aubio \
python310-aubio \
python3dist-aubio"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
