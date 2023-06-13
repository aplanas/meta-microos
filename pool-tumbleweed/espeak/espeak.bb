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

RPM_NAME = "espeak-1.48.04-6.26.aarch64.rpm"
RPM_HASH = "65db32862c113b95be498eb5372e64db7ee6e2b962d538dd73e34aaea8439cc068a43f0e05a90bf29065d51800b289c7c43495412e6d5cca72c9a595ec9cea77"

RPROVIDES:${PN} += "espeak \
espeak(aarch-64) \
libespeak.so.1()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libportaudio.so.2()(64bit)"

inherit rpm
