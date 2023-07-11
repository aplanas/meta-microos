SUMMARY = "LHA archive support for Python"
DESCRIPTION = "Lhafile is a python C extension to extract lha files (.lzh). \
The interface is similar to the zipfile module in the regular \
Python distribution."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python311-lhafile-0.2.2-1.26.aarch64.rpm"
RPM_HASH = "504c6c32e204fc90bc14d58f5c0ea29c4d4b7cafbee1258d06dba0e49a31b0932d15ce0cf8fc998c78f8c6ae7b25f21de1e5eba0f19764f7ee8cda885e2384dd"

RPROVIDES:${PN} += "python3-lhafile \
python3.11dist-lhafile \
python311-lhafile \
python3dist-lhafile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
