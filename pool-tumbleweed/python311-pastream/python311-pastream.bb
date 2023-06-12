SUMMARY = "GIL-less Portaudio Streams for Python"
DESCRIPTION = "Pastream builds on top of portaudio and sounddevice python bindings \
to provide some more functionality. Note that in addition to the \
pastream library, pastream includes a command line application for \
playing and recording audio files."
LICENSE = "MIT"

PV = "0.2.0.post0"

RPM_NAME = "python311-pastream-0.2.0.post0-4.10.aarch64.rpm"
RPM_HASH = "16c48b7b9dbcd657426ccc3e1f417d6d2358e5c988d70a09457fbe29517c01a5ae209e53d789cd073adc58a89c092c55269ef0898f086526397dbf95fddf36d1"

RPROVIDES:${PN} += "python3.11dist(pastream) \
python311-pastream \
python311-pastream(aarch-64) \
python3dist(pastream)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsndfile \
portaudio \
python(abi) \
python311-SoundFile \
python311-cffi \
python311-pa-ringbuffer \
python311-sounddevice \
update-alternatives"

inherit rpm