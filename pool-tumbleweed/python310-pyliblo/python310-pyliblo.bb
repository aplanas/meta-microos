SUMMARY = "Python bindings for the liblo Open Sound Control (OSC) library"
DESCRIPTION = "pyliblo is a Python wrapper for the liblo OSC library. \
It supports almost the complete functionality of liblo, \
allowing you to send and receive OSC messages using a nice and simple Python API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python310-pyliblo-0.10.0-2.11.aarch64.rpm"
RPM_HASH = "ef9cefc3664608ffe3da7e43d5b1719485c4a83d83950fbabded6010abb10f555fb3240c529535d43346adef4793e364a39d57109c4669e6fc95245c044b7ff8"

RPROVIDES:${PN} += "liblo.cpython-310-aarch64-linux-gnu.so()(64bit) \
python3-pyliblo \
python3.10dist(pyliblo) \
python310-pyliblo \
python310-pyliblo(aarch-64) \
python3dist(pyliblo)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblo.so.7()(64bit) \
python(abi)"

inherit rpm
