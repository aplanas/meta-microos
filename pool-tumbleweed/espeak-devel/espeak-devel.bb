SUMMARY = "Software speech synthesizer (text-to-speech) -- Development Files"
DESCRIPTION = "eSpeak is a compact open source software speech synthesizer for English \
and other languages. \
 \
eSpeak uses a 'formant synthesis' method. This allows many languages to \
be provided in a small size. The speech is clear, and can be used at \
high speeds, but is not as natural or smooth as larger synthesizers \
which are based on human speech recordings."
LICENSE = "GPL-3.0+"

PV = "1.48.04"

RPM_NAME = "espeak-devel-1.48.04-6.26.aarch64.rpm"
RPM_HASH = "f7e848f28294d7e0b4809911479b592937041e2988d12929158c07e354288f5724f6ddf949e8b76ac9b93bafae6d00345e9ef6d13325382804106e1e6dab4dbc"

RPROVIDES:${PN} += "espeak-devel \
espeak-devel(aarch-64)"
RDEPENDS:${PN} += "espeak"

inherit rpm
