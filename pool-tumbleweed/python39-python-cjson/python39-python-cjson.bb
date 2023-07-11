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

RPM_NAME = "python39-python-cjson-1.2.2-2.14.aarch64.rpm"
RPM_HASH = "74c1a3f6a9b7c4f86f5ece568d2a4ec6390d252940dd791d06d0e23e41dcb0f3afda54d2396cc7a8f0cd7c05e8843146553aac94bd5e74e73b7e5fb2204e4287"

RPROVIDES:${PN} += "python3.9dist-python-cjson \
python39-python-cjson \
python3dist-python-cjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
