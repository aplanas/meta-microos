SUMMARY = "Mycroft's TTS engine, based on CMU's Flite (Festival Lite)"
DESCRIPTION = "Mimic is a text-to-speech engine based on Carnegie Mellon \
University’s Flite (Festival-Lite) software. Mimic takes in text and \
reads it out loud to create a voice."
LICENSE = "BSD-3-Clause & MIT-CMU"

PV = "1.3.0.1"

RPM_NAME = "mimic-1.3.0.1-2.4.aarch64.rpm"
RPM_HASH = "b09a393312bf0a839052d446572b192dd8ed92b04b7f5744d2b2d98afc172ad56913ecf83a22bf4e0f65c1c174dec973ad4127ec1d36317d8ee6af635c446a7c"

RPROVIDES:${PN} += "mimic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libttsmimic-lang-all-langs.so.0 \
libttsmimic-lang-all-voices.so.0 \
libttsmimic-lang-cmu-time-awb.so.0 \
libttsmimic-lang-cmulex.so.0 \
libttsmimic-lang-usenglish.so.0 \
libttsmimic.so.0"

inherit rpm
