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

RPM_NAME = "libsamplerate0-0.2.2-1.8.aarch64.rpm"
RPM_HASH = "40737ea36e2ad7d3ac3514c4048d4b3e0ee787cdc31df1b8a5ff1e375b9ddaa85a2868a2558a6dcf6c097a9af0e62eda6ee681b28b87838289b48c709d0e20f0"

RPROVIDES:${PN} += "libsamplerate \
libsamplerate.so.0 \
libsamplerate0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
