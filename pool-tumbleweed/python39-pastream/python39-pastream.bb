SUMMARY = "GIL-less Portaudio Streams for Python"
DESCRIPTION = "Pastream builds on top of portaudio and sounddevice python bindings \
to provide some more functionality. Note that in addition to the \
pastream library, pastream includes a command line application for \
playing and recording audio files."
LICENSE = "MIT"

PV = "0.2.0.post0"

RPM_NAME = "python39-pastream-0.2.0.post0-4.10.aarch64.rpm"
RPM_HASH = "ac8607e59b339e7ce5bc86bc2c3b9ffb669584d082ca67f91d3d7565cc3ebd8d4668b61059f4a6d44a6457bef7d0d9e18707d41a28b0daf18925543e50d06e46"

RPROVIDES:${PN} += "python3.9dist-pastream \
python39-pastream \
python3dist-pastream"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsndfile \
portaudio \
python-abi \
python39-SoundFile \
python39-cffi \
python39-pa-ringbuffer \
python39-sounddevice \
update-alternatives"

inherit rpm
