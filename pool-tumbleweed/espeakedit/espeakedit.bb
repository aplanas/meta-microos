SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "eSpeak is a software speech synthesizer for English, and some other languages. \
eSpeakEdit provides a User Interface to edit the eSpeak voices."
LICENSE = "GPL-3.0+"

PV = "1.48.03"

RPM_NAME = "espeakedit-1.48.03-2.28.aarch64.rpm"
RPM_HASH = "6cf79dfd065067c04cb45c68e6a7b79faef8d60d055cfdf05a170d10ce34b60c4a15bdd03b5ca05ea3fc8eef0fa49aea28deaba1d61486544a307c948d5d8371"

RPROVIDES:${PN} += "espeakedit"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libportaudio.so.2 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0"

inherit rpm
