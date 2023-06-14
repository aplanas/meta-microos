SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "eSpeak is a software speech synthesizer for English, and some other languages. \
eSpeakEdit provides a User Interface to edit the eSpeak voices."
LICENSE = "GPL-3.0+"

PV = "1.48.03"

RPM_NAME = "espeakedit-1.48.03-2.27.aarch64.rpm"
RPM_HASH = "3bf36e6a84c2a08ea74649efa3766de8baf0d45531ec5f74e7959530f781395ad49784fc8f56bc5fa9f4bd0bb7712aca64752b6f750b4a6a7cb483f42c468235"

RPROVIDES:${PN} += "espeakedit"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libportaudio.so.2 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0"

inherit rpm
