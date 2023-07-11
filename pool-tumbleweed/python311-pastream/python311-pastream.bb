SUMMARY = "GIL-less Portaudio Streams for Python"
DESCRIPTION = "Pastream builds on top of portaudio and sounddevice python bindings \
to provide some more functionality. Note that in addition to the \
pastream library, pastream includes a command line application for \
playing and recording audio files."
LICENSE = "MIT"

PV = "0.2.0.post0"

RPM_NAME = "python311-pastream-0.2.0.post0-4.12.aarch64.rpm"
RPM_HASH = "54a4ea64b9df0f093cb2b183225b340726f60d631f1bd95400de7c5b36d909ba54c7f92aa2390abcdc2fc986e12f28219d80a6b4736fd667ac8f9486bd5729c6"

RPROVIDES:${PN} += "python3-pastream \
python3.11dist-pastream \
python311-pastream \
python3dist-pastream"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsndfile \
portaudio \
python-abi \
python311-SoundFile \
python311-cffi \
python311-pa-ringbuffer \
python311-sounddevice \
update-alternatives"

inherit rpm
