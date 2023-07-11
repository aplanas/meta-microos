SUMMARY = "Python bindings for the liblo Open Sound Control (OSC) library"
DESCRIPTION = "pyliblo is a Python wrapper for the liblo OSC library. \
It supports almost the complete functionality of liblo, \
allowing you to send and receive OSC messages using a nice and simple Python API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python311-pyliblo-0.10.0-2.12.aarch64.rpm"
RPM_HASH = "be4d5dd9960dd4826810cbb4471c48990b6ffe8fa4521e1ec1c9890d10ff9b9ea957f170f99f7da0be7e6647d3c917e3f7a40f2d870c3e8ee1f563ab2c179c10"

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
