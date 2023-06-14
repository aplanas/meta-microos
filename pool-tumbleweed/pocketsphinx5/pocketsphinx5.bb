SUMMARY = "Speech recognizer library written in C"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "pocketsphinx5-5~git20200227.e40da77-2.3.aarch64.rpm"
RPM_HASH = "994fe9ae6e107a35e9e6ada54fbf8c7ef8ddcfa344db39650332f676033e6d87b3c208a6d04c53ec8a3daa2e6c6b261c202631b30c0a06da9c77d12b1dcad695"

RPROVIDES:${PN} += "pocketsphinx5"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpocketsphinx.so.3 \
libsphinxad.so.3 \
libsphinxbase.so.3 \
update-alternatives"

inherit rpm
