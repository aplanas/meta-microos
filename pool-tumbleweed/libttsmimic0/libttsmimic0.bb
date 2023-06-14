SUMMARY = "Core libraries of Mycroft's TTS engine"
DESCRIPTION = "Mimic is a text-to-speech engine based on Carnegie Mellon \
University’s Flite (Festival-Lite) software. Mimic takes in text and \
reads it out loud to create a voice."
LICENSE = "BSD-3-Clause & MIT-CMU"

PV = "1.3.0.1"

RPM_NAME = "libttsmimic0-1.3.0.1-2.3.aarch64.rpm"
RPM_HASH = "c35077cf9081f52c43a444f9762e7c144b5b3c2cefdf4457cc6668c95e7296e4e95eec57935a2541ad913699442cb6aed48faa46dd40f4b2b4de977cb379dd92"

RPROVIDES:${PN} += "libttsmimic-lang-all-langs.so.0 \
libttsmimic-lang-all-voices.so.0 \
libttsmimic-lang-cmu-grapheme-lang.so.0 \
libttsmimic-lang-cmu-grapheme-lex.so.0 \
libttsmimic-lang-cmu-indic-lang.so.0 \
libttsmimic-lang-cmu-indic-lex.so.0 \
libttsmimic-lang-cmu-time-awb.so.0 \
libttsmimic-lang-cmu-us-awb.so.0 \
libttsmimic-lang-cmu-us-kal.so.0 \
libttsmimic-lang-cmu-us-kal16.so.0 \
libttsmimic-lang-cmu-us-rms.so.0 \
libttsmimic-lang-cmu-us-slt-hts.so.0 \
libttsmimic-lang-cmu-us-slt.so.0 \
libttsmimic-lang-cmulex.so.0 \
libttsmimic-lang-usenglish.so.0 \
libttsmimic-lang-vid-gb-ap.so.0 \
libttsmimic.so.0 \
libttsmimic0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libpcre2-8.so.0"

inherit rpm
