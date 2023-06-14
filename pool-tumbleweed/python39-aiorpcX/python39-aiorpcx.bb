SUMMARY = "Generic async RPC implementation, including JSON-RPC"
DESCRIPTION = "Generic async RPC implementation, including JSON-RPC"
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python39-aiorpcX-0.22.1-1.5.noarch.rpm"
RPM_HASH = "30aca259d9a24a9197f7c949cd799d17db2c7ad6c4978334f9dfa9377e1bb1c4c50155320fae96701a13325f1dd61be290cc3ea98d02ae438e4f4e930795cca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiorpcx \
python39-aiorpcX \
python3dist-aiorpcx"

RDEPENDS:${PN} += "python-abi \
python39-attrs"

inherit rpm
