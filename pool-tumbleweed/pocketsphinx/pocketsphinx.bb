SUMMARY = "Speech recognizer library written in C"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "pocketsphinx-0.8-5.15.aarch64.rpm"
RPM_HASH = "a42817a278c472f2ed0c5156f2e3321f668bd49e22af58462ab96da40b55ed38d3015effbf8768dedc88a27cffaa9199283bb99250a00f14b02202ee2af55ab0"

RPROVIDES:${PN} += "pocketsphinx \
pocketsphinx(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpocketsphinx.so.1()(64bit) \
libsphinxad.so.0()(64bit) \
libsphinxbase.so.1()(64bit) \
update-alternatives"

inherit rpm
