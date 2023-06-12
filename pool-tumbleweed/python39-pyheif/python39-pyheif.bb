SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python39-pyheif-0.7.1-2.1.aarch64.rpm"
RPM_HASH = "5124d3b6b9e500eb810fe5ce7f244fef2249aa99dcb8156cbc7b75092f8f23b0771088c324b85327ecfb7e29abdfed1f91b667866fe5384d660cfba5f9b7f832"

RPROVIDES:${PN} += "python3.9dist(pyheif) \
python39-pyheif \
python39-pyheif(aarch-64) \
python3dist(pyheif)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libheif.so.1()(64bit) \
python(abi) \
python39-cffi"

inherit rpm
