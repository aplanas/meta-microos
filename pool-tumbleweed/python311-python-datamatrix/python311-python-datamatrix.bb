SUMMARY = "A python library to work with tabular data"
DESCRIPTION = "The datamatrix package provides a high way to work with tabular data in Python. \
Tabular data is datasets that consist of named columns and numbered rows."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-python-datamatrix-1.0.2-1.3.noarch.rpm"
RPM_HASH = "14f09f8a7169cb97e54c3bc2d0d35dbcba40448ea1fcda445c279696d92dcfc327a3ea2798ae45040788a76923b101af417056aa97a400d95f7742215b0e8f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-datamatrix \
python3.11dist-datamatrix \
python311-python-datamatrix \
python3dist-datamatrix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
