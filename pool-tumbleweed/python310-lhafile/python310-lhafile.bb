SUMMARY = "LHA archive support for Python"
DESCRIPTION = "Lhafile is a python C extension to extract lha files (.lzh). \
The interface is similar to the zipfile module in the regular \
Python distribution."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python310-lhafile-0.2.2-1.26.aarch64.rpm"
RPM_HASH = "99765ef1e41e0ddb86e93623ae8c86fd38c62a14081986481139be8bb91906bdcc736c4203d06cb8d9d1d3dcc9a188915e9282eace220b6ce760b73ddfd1b8ae"

RPROVIDES:${PN} += "python3.10dist-lhafile \
python310-lhafile \
python3dist-lhafile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
