SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python310-pyheif-0.7.1-2.3.aarch64.rpm"
RPM_HASH = "36e6caef2d3b1925ff75b42b59e7166dc1541ebbffea03bdc77304a6da591f2853b4d1c139acabd397784114a154f22ff49d7c6eeb20f631feb1dc39f2a58dfe"

RPROVIDES:${PN} += "python3.10dist-pyheif \
python310-pyheif \
python3dist-pyheif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libheif.so.1 \
python-abi \
python310-cffi"

inherit rpm
