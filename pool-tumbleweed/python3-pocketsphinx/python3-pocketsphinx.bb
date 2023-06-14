SUMMARY = "Python3 bindings for pocketsphinx"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time. \
 \
This package provides python bindings for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "python3-pocketsphinx-0.8-5.15.aarch64.rpm"
RPM_HASH = "a7eb53db6ffebe3c15d50a6d3f4534074d1e0175dc6f989a3bee816d1fd6ccb4ab6f4cf1e0429d3185ea57bae7d0ddb8c70beee68416491445a0ccc8554ba6f0"

RPROVIDES:${PN} += "python3-pocketsphinx \
python3.10dist-pocketsphinx \
python3dist-pocketsphinx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpocketsphinx.so.1 \
libsphinxbase.so.1 \
pocketsphinx \
python-abi \
python3-sphinxbase"

inherit rpm
