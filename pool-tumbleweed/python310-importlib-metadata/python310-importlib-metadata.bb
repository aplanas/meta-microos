SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "6.8.0"

RPM_NAME = "python310-importlib-metadata-6.8.0-1.1.noarch.rpm"
RPM_HASH = "5b83d709e9958b28d565f7f0b4674fb4ff2fbbe86e3c0f6717c1d736517d51b2b55d7e87fafea46b99d129ca597be06a6c5bcfd6d2006b68e93d997681058c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-importlib-metadata \
python310-importlib-metadata \
python3dist-importlib-metadata"

RDEPENDS:${PN} += "python-abi \
python310-zipp"

inherit rpm
