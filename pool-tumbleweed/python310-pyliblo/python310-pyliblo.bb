SUMMARY = "Python bindings for the liblo Open Sound Control (OSC) library"
DESCRIPTION = "pyliblo is a Python wrapper for the liblo OSC library. \
It supports almost the complete functionality of liblo, \
allowing you to send and receive OSC messages using a nice and simple Python API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python310-pyliblo-0.10.0-3.1.aarch64.rpm"
RPM_HASH = "8bb29bdf4844b5a83a1015351a9b9243732a541923680da4ac20fc157866d2b5b9b051eb013cf87e025a6ff4850f751650b5e14f66635b7ca4ac0d070d9df6d1"

RPROVIDES:${PN} += "liblo.cpython-310-aarch64-linux-gnu.so \
python3.10dist-pyliblo \
python310-pyliblo \
python3dist-pyliblo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblo.so.7 \
python-abi"

inherit rpm
