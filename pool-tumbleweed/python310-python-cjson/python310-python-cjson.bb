SUMMARY = "C-accelerated JSON encoder/decoder for Python"
DESCRIPTION = "JSON (JavaScript Object Notation) is a text-based data exchange \
format. \
 \
The module is written in C and it is up to 250 times faster when compared to \
the other Python JSON implementations which are written directly in Python. \
This speed gain varies with the complexity of the data and the operation and is \
the the range of 10-200 times for encoding operations and in the range of \
100-250 times for decoding operations."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "python310-python-cjson-1.2.2-2.12.aarch64.rpm"
RPM_HASH = "b7f30b2a601ec910f8c7055710456888333a67f416c3f3d54dcd784d27909f176925936e4e9c58440bd7376555ae6b74f98cee063e3f211624d7755f36859a6d"

RPROVIDES:${PN} += "python3-python-cjson \
python3.10dist(python-cjson) \
python310-python-cjson \
python310-python-cjson(aarch-64) \
python3dist(python-cjson)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
