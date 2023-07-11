SUMMARY = "URI parsing, classification and composition"
DESCRIPTION = "URI parsing, classification and composition."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-uritools-4.0.0-1.4.noarch.rpm"
RPM_HASH = "e76de6c58056224197bbaae715ccd33a9e7fb246daed9619674aa9aa3497e824a2efe7d846c687f2d6788a4fd0f80a84d173d1a8310657c6a668e17559d4fb90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uritools \
python310-uritools \
python3dist-uritools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
