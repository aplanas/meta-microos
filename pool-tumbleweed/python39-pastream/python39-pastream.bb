SUMMARY = "GIL-less Portaudio Streams for Python"
DESCRIPTION = "Pastream builds on top of portaudio and sounddevice python bindings \
to provide some more functionality. Note that in addition to the \
pastream library, pastream includes a command line application for \
playing and recording audio files."
LICENSE = "MIT"

PV = "0.2.0.post0"

RPM_NAME = "python39-pastream-0.2.0.post0-4.12.aarch64.rpm"
RPM_HASH = "0723b6d94c0bedad722c1d8486a94751162f5de9473de8e9e784c03c0f78004d7f2fadff879aa61c6bb7249c88b7ffa68c305eeca60a8440fb101e291c2c471c"

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
