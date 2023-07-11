SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "6.6.0"

RPM_NAME = "python310-importlib-metadata-6.6.0-1.3.noarch.rpm"
RPM_HASH = "12e4bcdb69717a6af58fb8d1f42aa026dde5b1d1474806da89eb7fd1824acc57eadbc46a7cd35865e136d102d7273e3aa7ce91e05efa9d832bfd0c4f6779cf4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-importlib-metadata \
python310-importlib-metadata \
python3dist-importlib-metadata"

RDEPENDS:${PN} += "python-abi \
python310-zipp"

inherit rpm
