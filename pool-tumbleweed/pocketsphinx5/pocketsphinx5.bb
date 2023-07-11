SUMMARY = "Speech recognizer library written in C"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "pocketsphinx5-5~git20200227.e40da77-2.4.aarch64.rpm"
RPM_HASH = "cc041c2c581f2bc850f9178ef78a3045f03277b206447954f5ca69ae07d222365325c0a07760cfa233338b886fb65c7109b059730fe6db99a7cb9d9764375a6d"

RPROVIDES:${PN} += "pocketsphinx5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpocketsphinx.so.3 \
libsphinxad.so.3 \
libsphinxbase.so.3 \
update-alternatives"

inherit rpm
