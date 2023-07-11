SUMMARY = "Recurrent neural network for audio noise reduction - Shared library"
DESCRIPTION = "RNNoise is a noise suppression library based on a recurrent neural network. \
 \
This package holds the shared library."
LICENSE = "BSD-3-Clause"

PV = "0.git20210122.1cbdbcf"

RPM_NAME = "librnnoise0-0.git20210122.1cbdbcf-1.9.aarch64.rpm"
RPM_HASH = "3aea413bd812939baba74f4e0ab70fe26e554ce7788c49c207392302eea0b2574b86addc49bd1171114c0839bad3c0134902eadfccf2a7dfd0eaa84a0d2e8f73"

RPROVIDES:${PN} += "librnnoise.so.0 \
librnnoise0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
