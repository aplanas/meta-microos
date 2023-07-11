SUMMARY = "GIL-less Portaudio Streams for Python"
DESCRIPTION = "Pastream builds on top of portaudio and sounddevice python bindings \
to provide some more functionality. Note that in addition to the \
pastream library, pastream includes a command line application for \
playing and recording audio files."
LICENSE = "MIT"

PV = "0.2.0.post0"

RPM_NAME = "python310-pastream-0.2.0.post0-4.12.aarch64.rpm"
RPM_HASH = "b7ba9cfb7482d301827355a6e5adce30d474b98f88c05c146277670f710751dd11a457647a5331456b53b9bd7df0f8012f13d2447e2d284fd62e7f2651b9dfcc"

RPROVIDES:${PN} += "python3.10dist-pastream \
python310-pastream \
python3dist-pastream"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsndfile \
portaudio \
python-abi \
python310-SoundFile \
python310-cffi \
python310-pa-ringbuffer \
python310-sounddevice \
update-alternatives"

inherit rpm
