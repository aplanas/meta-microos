SUMMARY = "A python library to work with tabular data"
DESCRIPTION = "The datamatrix package provides a high way to work with tabular data in Python. \
Tabular data is datasets that consist of named columns and numbered rows."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-python-datamatrix-1.0.2-1.3.noarch.rpm"
RPM_HASH = "4140f6fc4aaf7af8026d9a9f1bf228a9fba6282b285d915a7eae61e27c7bbe9731107131c887dc50fd2492dbbe9d85277abe6f8de68200c06d09a91f5bcd09d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-datamatrix \
python310-python-datamatrix \
python3dist-datamatrix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
