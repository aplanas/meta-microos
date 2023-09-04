SUMMARY = "Python bindings for the liblo Open Sound Control (OSC) library"
DESCRIPTION = "pyliblo is a Python wrapper for the liblo OSC library. \
It supports almost the complete functionality of liblo, \
allowing you to send and receive OSC messages using a nice and simple Python API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python311-pyliblo-0.10.0-3.1.aarch64.rpm"
RPM_HASH = "291ff215bd6c07bca569563b2f8381b7a44260a22402599730b828de7757d50174aeec938a3c4fbdbfe76afc2d580f8c37d287c10afd6f6c7f9842f525b6639c"

RPROVIDES:${PN} += "liblo.cpython-311-aarch64-linux-gnu.so \
python3-pyliblo \
python3.11dist-pyliblo \
python311-pyliblo \
python3dist-pyliblo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblo.so.7 \
python-abi"

inherit rpm
