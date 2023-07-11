SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "eSpeak is a compact open source software speech synthesizer for English \
and other languages. \
 \
eSpeak uses a 'formant synthesis' method. This allows many languages to \
be provided in a small size. The speech is clear, and can be used at \
high speeds, but is not as natural or smooth as larger synthesizers \
which are based on human speech recordings."
LICENSE = "GPL-3.0+"

PV = "1.48.04"

RPM_NAME = "espeak-1.48.04-6.27.aarch64.rpm"
RPM_HASH = "572ed58fb20ac64b41ec13646dd309af41de82c134753d2bc3c6bd77ce6e7756c86a047f5fc38052fe9a279d7d6d720e28cfa5b166019557778b05072f81b182"

RPROVIDES:${PN} += "espeak \
libespeak.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libportaudio.so.2"

inherit rpm
