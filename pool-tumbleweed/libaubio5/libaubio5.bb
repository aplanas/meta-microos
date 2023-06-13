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

RPROVIDES:${PN} += "libaubio.so.5()(64bit) \
libaubio5 \
libaubio5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfftw3f.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libswresample.so.3.9()(64bit) \
libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit)"

inherit rpm
