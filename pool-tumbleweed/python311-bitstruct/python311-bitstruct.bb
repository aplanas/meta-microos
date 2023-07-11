SUMMARY = "Interpret strings as packed binary data"
DESCRIPTION = "This module is intended to have a similar interface as the python struct \
module, but working on bits instead of primitive data types (char, int, ...)."
LICENSE = "MIT"

PV = "8.17.0"

RPM_NAME = "python311-bitstruct-8.17.0-1.3.aarch64.rpm"
RPM_HASH = "f7cf6e39c5d3c03a214c5e8c503c06652ccb859f897084cd7aa5ec0617f089a791866b7a37e2366b26a838a60d25107acb65936c1e617c9abbe13cd07fe09f3d"

RPROVIDES:${PN} += "python3-bitstruct \
python3.11dist-bitstruct \
python311-bitstruct \
python3dist-bitstruct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
