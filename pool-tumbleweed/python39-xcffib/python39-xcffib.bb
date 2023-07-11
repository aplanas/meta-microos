SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python39-xcffib-1.3.0-1.3.noarch.rpm"
RPM_HASH = "f71b4c1eb26f2c96a5f95dbb0157821cd5f7087fc5a4a75c5e568b82314b79006d762ee415020323709e90bdddf503a77a5cc4f3a6d517aa91fc1405c6d55010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xcffib \
python39-xcffib \
python3dist-xcffib"

RDEPENDS:${PN} += "python-abi \
python39-cffi"

inherit rpm
