SUMMARY = "Python bindings for the liblo Open Sound Control (OSC) library"
DESCRIPTION = "pyliblo is a Python wrapper for the liblo OSC library. \
It supports almost the complete functionality of liblo, \
allowing you to send and receive OSC messages using a nice and simple Python API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python310-pyliblo-0.10.0-2.12.aarch64.rpm"
RPM_HASH = "312b96721f5b793d1642ee16cf250874809e8dd39c251fb2bc34b3dcbda69fcf42adaf6a7a10a49dab5547d8bf801d1ded9b5aedf23a6a23a3399dff5f962ed3"

RPROVIDES:${PN} += "liblo.cpython-310-aarch64-linux-gnu.so \
python3.10dist-pyliblo \
python310-pyliblo \
python3dist-pyliblo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblo.so.7 \
python-abi"

inherit rpm
