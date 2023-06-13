SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python310-pyheif-0.7.1-2.1.aarch64.rpm"
RPM_HASH = "87f3ef4b80a1b861aef44745e9837ce4ad10433d489fe79c9227d060f741234f4da6d17dedad21d6affed410efb2bacca75b87b31ac6b21cd14a20162e4f284e"

RPROVIDES:${PN} += "python3-pyheif \
python3.10dist(pyheif) \
python310-pyheif \
python310-pyheif(aarch-64) \
python3dist(pyheif)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libheif.so.1()(64bit) \
python(abi) \
python310-cffi"

inherit rpm
