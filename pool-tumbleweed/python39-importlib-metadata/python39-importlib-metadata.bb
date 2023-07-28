SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "6.8.0"

RPM_NAME = "python39-importlib-metadata-6.8.0-1.1.noarch.rpm"
RPM_HASH = "1326f20d1327bdb79befa5788226635d0b4428af57591be22a993223ead7c736e4ab066f8b31ce24f52af038e2216b84e625660e72e894ba0bd26b888753f538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-importlib-metadata \
python39-importlib-metadata \
python3dist-importlib-metadata"

RDEPENDS:${PN} += "python-abi \
python39-zipp"

inherit rpm
