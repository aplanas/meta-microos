SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "3.0.0"

RPM_NAME = "python311-pytest-metadata-3.0.0-1.1.noarch.rpm"
RPM_HASH = "bae530b894ab081eb206cddbc5ff6ce3528dd258fb50d31f2ca3fd760d4c58fc42061cf7ca23bdb07cff6b94ee8b3c01f734a8b38328106ceb4eced651bd198e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-metadata \
python3.11dist-pytest-metadata \
python311-pytest-metadata \
python3dist-pytest-metadata"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
