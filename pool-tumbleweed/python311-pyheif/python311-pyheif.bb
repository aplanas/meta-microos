SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python311-pyheif-0.7.1-2.3.aarch64.rpm"
RPM_HASH = "f4048fd0cefd1220c0af9b0d00912fcdc461e550248cf38900f7529adca048c0b2ea8c4db579374365724ac0c27d38eb9de780a7f33e92f5aa862667472ba88a"

RPROVIDES:${PN} += "python3-pyheif \
python3.11dist-pyheif \
python311-pyheif \
python3dist-pyheif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libheif.so.1 \
python-abi \
python311-cffi"

inherit rpm
