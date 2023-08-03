SUMMARY = "Library for real-time audio labelling"
DESCRIPTION = "Aubio is a library for real time audio labelling. Its features include \
segmenting a sound file before each of its attacks, performing pitch \
detection, tapping the beat and producing midi streams from live audio. \
The name aubio comes from 'audio' with a typo: several transcription \
errors are likely to be found in the results too."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "libaubio5-0.4.9-10.1.aarch64.rpm"
RPM_HASH = "bcc1ba1f47989525ee390ec7618fdf28dad31476f6a904afc5e3886cd97cfa788c037e48f2cf76eac9ea5f77a628aed3c300205bf6ed2833d8325f3f6fa8d0b6"

RPROVIDES:${PN} += "libaubio.so.5 \
libaubio5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6 \
libsamplerate.so.0 \
libsndfile.so.1 \
libswresample.so.3.9"

inherit rpm
