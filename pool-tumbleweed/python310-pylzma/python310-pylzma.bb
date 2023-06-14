SUMMARY = "Python bindings for the LZMA compression library"
DESCRIPTION = "PyLZMA provides a platform independent way to read and write data \
that has been compressed or can be decompressed by the LZMA library."
LICENSE = "LGPL-2.1-only"

PV = "0.5.0"

RPM_NAME = "python310-pylzma-0.5.0-2.11.aarch64.rpm"
RPM_HASH = "75771459bcfde54cf05bd850444e37e2333e993fa266a58c5fddd98c8e51352e945fda6519b525b9b2f6ef831a466950c7289a9f53008b363db630b010e20237"

RPROVIDES:${PN} += "python3-pylzma \
python3.10dist-pylzma \
python310-pylzma \
python3dist-pylzma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
