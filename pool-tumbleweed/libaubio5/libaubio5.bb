SUMMARY = "Library for real-time audio labelling"
DESCRIPTION = "Aubio is a library for real time audio labelling. Its features include \
segmenting a sound file before each of its attacks, performing pitch \
detection, tapping the beat and producing midi streams from live audio. \
The name aubio comes from 'audio' with a typo: several transcription \
errors are likely to be found in the results too."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "libaubio5-0.4.9-9.1.aarch64.rpm"
RPM_HASH = "d823a676a10ccd563ab1e753e6dbfcd3e1fe6c7fe3fb6f4e64a30266098b6c22212c492fc147f53d3afa1faf639f1fb29b65f5e9fd16a1b0556adc3a848a610b"

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
