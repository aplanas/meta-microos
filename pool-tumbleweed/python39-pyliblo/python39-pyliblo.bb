SUMMARY = "Python bindings for the liblo Open Sound Control (OSC) library"
DESCRIPTION = "pyliblo is a Python wrapper for the liblo OSC library. \
It supports almost the complete functionality of liblo, \
allowing you to send and receive OSC messages using a nice and simple Python API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python39-pyliblo-0.10.0-2.12.aarch64.rpm"
RPM_HASH = "9682ed65b868837fa805e929866aa01cb2487f97b661aa3f7d108972b575fc7ba9809a282c308ffa2443168264e02f3af1c9ea8530337e7f84212b52e683f65c"

RPROVIDES:${PN} += "liblo.cpython-39-aarch64-linux-gnu.so \
python3.9dist-pyliblo \
python39-pyliblo \
python3dist-pyliblo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblo.so.7 \
python-abi"

inherit rpm
