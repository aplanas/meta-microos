SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python311-pyheif-0.7.1-2.1.aarch64.rpm"
RPM_HASH = "ea13106db58af628b40eafaf9b3e376d1773fb1e0e8d38021ecca3823128c4afa79ef8e06e13238867e4f77c1d0f8d11d35dadbf5d68c5590b359f11e43d4810"

RPROVIDES:${PN} += "python3.11dist-pyheif \
python311-pyheif \
python3dist-pyheif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libheif.so.1 \
python-abi \
python311-cffi"

inherit rpm
