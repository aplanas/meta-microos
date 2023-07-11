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

RPM_NAME = "python310-python-cjson-1.2.2-2.14.aarch64.rpm"
RPM_HASH = "2e10b7ddb814c9530b063718c3ace3be5b1ace6429ec4dcf7ef9f26b9f8939de041d90c4fee2059bd85951fd1d36d90806e2875de1d5467ba7f7b60e9c615b9b"

RPROVIDES:${PN} += "python3.10dist-python-cjson \
python310-python-cjson \
python3dist-python-cjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
