SUMMARY = "Mycroft's TTS engine, based on CMU's Flite (Festival Lite)"
DESCRIPTION = "Mimic is a text-to-speech engine based on Carnegie Mellon \
University’s Flite (Festival-Lite) software. Mimic takes in text and \
reads it out loud to create a voice."
LICENSE = "BSD-3-Clause & MIT-CMU"

PV = "1.3.0.1"

RPM_NAME = "mimic-1.3.0.1-2.3.aarch64.rpm"
RPM_HASH = "57ddbfaff77c67474ea44afb6b5838468c4938bf950f96433bab129e209b7b894d147713b5f049d39e7d2ca3f2a70bcc2991edbea92c8a5c3da60bf9f80412af"

RPROVIDES:${PN} += "mimic \
mimic(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libttsmimic.so.0()(64bit) \
libttsmimic_lang_all_langs.so.0()(64bit) \
libttsmimic_lang_all_voices.so.0()(64bit) \
libttsmimic_lang_cmu_time_awb.so.0()(64bit) \
libttsmimic_lang_cmulex.so.0()(64bit) \
libttsmimic_lang_usenglish.so.0()(64bit)"

inherit rpm
