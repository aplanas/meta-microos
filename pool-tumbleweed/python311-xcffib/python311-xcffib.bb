SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python311-xcffib-1.3.0-1.1.noarch.rpm"
RPM_HASH = "a00462a3bcae4f4cc1e67b6c41900903df0aa1afe42c1c312a26f02aa8905ed700f72cc868bd235e3b44868607bd4f807b1473b433d1559fedae6eded93db7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-xcffib \
python311-xcffib \
python3dist-xcffib"

RDEPENDS:${PN} += "python-abi \
python311-cffi"

inherit rpm
