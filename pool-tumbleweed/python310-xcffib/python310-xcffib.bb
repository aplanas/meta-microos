SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python310-xcffib-1.3.0-1.3.noarch.rpm"
RPM_HASH = "8328c6a308f697686092beca49b39c8eac798f88ae638b92d653651bad13572d00829e3c54bd299516e4b962754620152b511a9b78d39c24ca464655c76f9d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xcffib \
python310-xcffib \
python3dist-xcffib"

RDEPENDS:${PN} += "python-abi \
python310-cffi"

inherit rpm
