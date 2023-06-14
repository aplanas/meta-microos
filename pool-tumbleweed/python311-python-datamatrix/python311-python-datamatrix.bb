SUMMARY = "A python library to work with tabular data"
DESCRIPTION = "The datamatrix package provides a high way to work with tabular data in Python. \
Tabular data is datasets that consist of named columns and numbered rows."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-python-datamatrix-1.0.2-1.1.noarch.rpm"
RPM_HASH = "efe082f3dff6d53d965ddb3f55ea99953fa01d6d991d48c72fdf0f2b909724a660664e70a6d7a30e8b5a9959b27348bb5912bacbdbbdbfbaeed6ac16348141a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-datamatrix \
python311-python-datamatrix \
python3dist-datamatrix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
