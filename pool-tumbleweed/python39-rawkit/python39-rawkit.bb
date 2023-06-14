SUMMARY = "CTypes based LibRaw bindings"
DESCRIPTION = "The rawkit (pronounced rocket) module is a ctypes-based LibRaw \
binding for Python inspired by the Wand API."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-rawkit-0.6.0-3.5.noarch.rpm"
RPM_HASH = "8ba2fc08b73dbd3cc935ed5cc1977fae8812c898dfac1b18300f4dc8e84aa599b9839f6d966f27f7ba573ac2f91272ee6d8210b479ff57343f04e970a0d6dbe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rawkit \
python39-rawkit \
python3dist-rawkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
