SUMMARY = "A python library to work with tabular data"
DESCRIPTION = "The datamatrix package provides a high way to work with tabular data in Python. \
Tabular data is datasets that consist of named columns and numbered rows."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-python-datamatrix-1.0.2-1.3.noarch.rpm"
RPM_HASH = "c367cb778f0cad1801b1f2a068958c239be90b715470113b4f4b7e97cb84506579576f8c03d8deda53129ecd12f10c0e4ce5257ee8802b923012e1f5b39361cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-datamatrix \
python39-python-datamatrix \
python3dist-datamatrix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
