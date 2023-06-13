SUMMARY = "Python bindings for the LZMA compression library"
DESCRIPTION = "PyLZMA provides a platform independent way to read and write data \
that has been compressed or can be decompressed by the LZMA library."
LICENSE = "LGPL-2.1-only"

PV = "0.5.0"

RPM_NAME = "python311-pylzma-0.5.0-2.11.aarch64.rpm"
RPM_HASH = "b06e54b915d4671678d5592a0e3d0da5bbbf694a28ec18d7dd4f8cef3333aa0669acb49b9b869d56aeeb24cea5b38739461923fde83405b97b3b70f46fe22cb5"

RPROVIDES:${PN} += "python3.11dist(pylzma) \
python311-pylzma \
python311-pylzma(aarch-64) \
python3dist(pylzma)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
