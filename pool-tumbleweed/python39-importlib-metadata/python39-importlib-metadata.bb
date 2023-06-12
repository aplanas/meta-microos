SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "6.6.0"

RPM_NAME = "python39-importlib-metadata-6.6.0-1.1.noarch.rpm"
RPM_HASH = "c94bc93ef152c1b7bad0a2fa9d93e65fecd5472753a95acc4eb41f4b4804b77502b2c1637e364aa10a22e0979e8bf48a5e1b5c3e0956a55e8833b1d5171addd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(importlib-metadata) \
python39-importlib-metadata \
python39-importlib_metadata \
python3dist(importlib-metadata)"
RDEPENDS:${PN} += "python(abi) \
python39-zipp"

inherit rpm
