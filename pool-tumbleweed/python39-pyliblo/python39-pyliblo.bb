SUMMARY = "Python bindings for the liblo Open Sound Control (OSC) library"
DESCRIPTION = "pyliblo is a Python wrapper for the liblo OSC library. \
It supports almost the complete functionality of liblo, \
allowing you to send and receive OSC messages using a nice and simple Python API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python39-pyliblo-0.10.0-3.1.aarch64.rpm"
RPM_HASH = "eaf3cd6764096d8d792fc35d5e0472e7824f8b49bd2413b80130dc3cd6c2813c3ea18d01bf1c2e098d539c88b189aa75642ef7561f7b7946d48cdd00e8241394"

RPROVIDES:${PN} += "liblo.cpython-39-aarch64-linux-gnu.so \
python3.9dist-pyliblo \
python39-pyliblo \
python3dist-pyliblo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblo.so.7 \
python-abi"

inherit rpm
