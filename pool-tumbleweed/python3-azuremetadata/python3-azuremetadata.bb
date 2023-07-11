SUMMARY = "Python module for collecting instance metadata from Azure"
DESCRIPTION = "A module for collecting instance metadata from Microsoft Azure."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.5"

RPM_NAME = "python3-azuremetadata-5.1.5-1.6.noarch.rpm"
RPM_HASH = "9ad02e6a1573310497eed103ac45b9eb6dd52610e95fa35235f5f6b5740dc4049d8c2cafb0b7e229adf797335c5ab29757098e5cf9b255e26b963b9a1665ea53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azuremetadata \
python3-azuremetadata \
python3.11dist-azuremetadata \
python3dist-azuremetadata"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
