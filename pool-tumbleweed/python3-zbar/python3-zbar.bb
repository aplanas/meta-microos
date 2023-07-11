SUMMARY = "Python3 module for ZBar"
DESCRIPTION = "This package contains the module to use ZBar from python3."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "python3-zbar-0.23.90-4.1.aarch64.rpm"
RPM_HASH = "c5d4c4cfafee488504691375956d73197945ee743d0976aa9e01753d2be56c0b2f5f7fd263082f74b3f0b7798f258d87f43deda6895d3c167383adcc7fdafc86"

RPROVIDES:${PN} += "python3-zbar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzbar.so.0 \
python-abi"

inherit rpm
