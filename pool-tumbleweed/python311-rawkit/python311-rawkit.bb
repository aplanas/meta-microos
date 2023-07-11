SUMMARY = "CTypes based LibRaw bindings"
DESCRIPTION = "The rawkit (pronounced rocket) module is a ctypes-based LibRaw \
binding for Python inspired by the Wand API."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-rawkit-0.6.0-3.7.noarch.rpm"
RPM_HASH = "f7da805a8a0b458a5a70c8223359277aff333986fd6045f526823758569149c3906bb6b7fac42b43b2091f52645cea6ad62024750c4fae2bc5f87800b2611d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rawkit \
python3.11dist-rawkit \
python311-rawkit \
python3dist-rawkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
