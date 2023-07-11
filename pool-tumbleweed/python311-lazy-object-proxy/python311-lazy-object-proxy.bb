SUMMARY = "Rebuild a new abstract syntax tree from Python's ast"
DESCRIPTION = "A fast and thorough lazy object proxy that rebuilds a new abstract syntax tree \
from Python's ast"
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "python311-lazy-object-proxy-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "756a6a0b45aa8ac75095ad5462a2b81d4c4d66bdcfb2c047201feb69828ae7a2e168651188eb747de62b4a28099b2bb7c0ca58097b18e00fe739defde9e0e461"

RPROVIDES:${PN} += "python3-lazy-object-proxy \
python3.11dist-lazy-object-proxy \
python311-lazy-object-proxy \
python3dist-lazy-object-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
