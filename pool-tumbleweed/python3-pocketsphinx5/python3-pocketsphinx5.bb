SUMMARY = "Python bindings for pocketsphinx"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time. \
 \
This package provides python bindings for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "python3-pocketsphinx5-5~git20200227.e40da77-2.4.aarch64.rpm"
RPM_HASH = "8ccc4232481dca4d7f6cdfad233c4093a2a8dd1f9b6e12081a89422e0be76821107b50270d63614dcce7ff348eb8e98a322de4325d5b66fe844080f0dd666815"

RPROVIDES:${PN} += "python3-pocketsphinx-python \
python3-pocketsphinx5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpocketsphinx.so.3 \
libsphinxbase.so.3 \
pocketsphinx5 \
python-abi \
python3-sphinxbase5"

inherit rpm
