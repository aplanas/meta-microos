SUMMARY = "Mycroft's TTS engine, based on CMU's Flite (Festival Lite)"
DESCRIPTION = "Mimic is a text-to-speech engine based on Carnegie Mellon \
University’s Flite (Festival-Lite) software. Mimic takes in text and \
reads it out loud to create a voice."
LICENSE = "BSD-3-Clause & MIT-CMU"

PV = "1.3.0.1"

RPM_NAME = "mimic-1.3.0.1-2.3.aarch64.rpm"
RPM_HASH = "57ddbfaff77c67474ea44afb6b5838468c4938bf950f96433bab129e209b7b894d147713b5f049d39e7d2ca3f2a70bcc2991edbea92c8a5c3da60bf9f80412af"

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
