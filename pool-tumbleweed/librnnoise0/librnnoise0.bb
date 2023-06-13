SUMMARY = "Recurrent neural network for audio noise reduction - Shared library"
DESCRIPTION = "RNNoise is a noise suppression library based on a recurrent neural network. \
 \
This package holds the shared library."
LICENSE = "BSD-3-Clause"

PV = "0.git20210122.1cbdbcf"

RPM_NAME = "librnnoise0-0.git20210122.1cbdbcf-1.8.aarch64.rpm"
RPM_HASH = "6d4adc3cebf801bc5bcb00fd3d3e92a2afd93de424d4b15a9cdd11d4d61ab49688b884e1ec27bc458e3f2eaa38f981605debfb801d1f051f901ee60e2ea098fc"

RPROVIDES:${PN} += "librnnoise.so.0()(64bit) \
librnnoise0 \
librnnoise0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
