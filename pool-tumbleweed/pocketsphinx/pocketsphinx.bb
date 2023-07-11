SUMMARY = "Speech recognizer library written in C"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "pocketsphinx-0.8-5.16.aarch64.rpm"
RPM_HASH = "1b27df72c1a176346fa99d77d777a3ea606f70dd26fe9ef242382d296e145b9e3aa917c54619c4a339dedc622652f6f8be89cd9b8bd3d21b750a9fe431d68415"

RPROVIDES:${PN} += "pocketsphinx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpocketsphinx.so.1 \
libsphinxad.so.0 \
libsphinxbase.so.1 \
update-alternatives"

inherit rpm
