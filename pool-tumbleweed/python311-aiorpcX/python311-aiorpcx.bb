SUMMARY = "Generic async RPC implementation, including JSON-RPC"
DESCRIPTION = "Generic async RPC implementation, including JSON-RPC"
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python311-aiorpcX-0.22.1-1.7.noarch.rpm"
RPM_HASH = "6308ba041cdf356a841ff93b360508a2c3fbb6046381a8cd6f7109415b8a94f555d1544bbd25842c0353f8975da586ba000b05aad3523d8b7345131d0397765a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiorpcX \
python3.11dist-aiorpcx \
python311-aiorpcX \
python3dist-aiorpcx"

RDEPENDS:${PN} += "python-abi \
python311-attrs"

inherit rpm
