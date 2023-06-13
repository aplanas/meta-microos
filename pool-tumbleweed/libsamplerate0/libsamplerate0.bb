SUMMARY = "A Sample Rate Converter Library"
DESCRIPTION = "Secret Rabbit Code (aka libsamplerate) is a Sample Rate Converter for \
audio. One example of where such a thing would be useful is in \
converting audio from the CD sample rate of 44.1kHz to the 48kHz sample \
rate used by DAT players. \
 \
SRC is capable of arbitrary and time varying conversions; from \
downsampling by a factor of 12 to upsampling by the same factor.  The \
conversion ratio can also vary with time for speeding up and slowing \
down effects."
LICENSE = "BSD-2-Clause"

PV = "0.2.2"

RPM_NAME = "libsamplerate0-0.2.2-1.7.aarch64.rpm"
RPM_HASH = "edc0f67eb8136b342b7da54ad491d9543f0848cc586d653c408d597fde67d39e829005aa436fbfa8f401b248c8bf47a3c7bfd93a8d6bd2f4805a21895c8f4a06"

RPROVIDES:${PN} += "libsamplerate \
libsamplerate.so.0()(64bit) \
libsamplerate0 \
libsamplerate0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
