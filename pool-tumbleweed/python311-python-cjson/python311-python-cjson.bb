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

RPM_NAME = "python311-python-cjson-1.2.2-2.14.aarch64.rpm"
RPM_HASH = "fa6dc29e7b56997abfa08087fab2c39a21ab99b299d51827baf534c7fca336d2cfa2c56bdb96ed7248da458686f48233c91166057a93ab4823c3188cdd77a0d9"

RPROVIDES:${PN} += "python3-python-cjson \
python3.11dist-python-cjson \
python311-python-cjson \
python3dist-python-cjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
