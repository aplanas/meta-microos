SUMMARY = "GIL-less Portaudio Streams for Python"
DESCRIPTION = "Pastream builds on top of portaudio and sounddevice python bindings \
to provide some more functionality. Note that in addition to the \
pastream library, pastream includes a command line application for \
playing and recording audio files."
LICENSE = "MIT"

PV = "0.2.0.post0"

RPM_NAME = "python310-pastream-0.2.0.post0-4.10.aarch64.rpm"
RPM_HASH = "c80f9871161347be0687b4ec2e28f0946185ebe2666688a0c50eb8c5dda80f9e1c9171ce24aeddaedefeb7e37565b056a6e6c835a5a593e2d261b03e2a3b0c45"

RPROVIDES:${PN} += "python3-pastream \
python3.10dist(pastream) \
python310-pastream \
python310-pastream(aarch-64) \
python3dist(pastream)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsndfile \
portaudio \
python(abi) \
python310-SoundFile \
python310-cffi \
python310-pa-ringbuffer \
python310-sounddevice \
update-alternatives"

inherit rpm
