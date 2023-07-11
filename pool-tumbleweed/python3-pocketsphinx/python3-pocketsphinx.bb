SUMMARY = "Python3 bindings for pocketsphinx"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time. \
 \
This package provides python bindings for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "python3-pocketsphinx-0.8-5.16.aarch64.rpm"
RPM_HASH = "55b2e6116802691c82bdb6928719688cda3f9ddc1f77104f387b4c02d2871bf72060d31c67bd9b52c85d9b621f41d8ed65670e8eabb1de9e94940e11bddbc82f"

RPROVIDES:${PN} += "python3-pocketsphinx \
python3.11dist-pocketsphinx \
python3dist-pocketsphinx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpocketsphinx.so.1 \
libsphinxbase.so.1 \
pocketsphinx \
python-abi \
python3-sphinxbase"

inherit rpm
