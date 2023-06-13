SUMMARY = "A python library to work with tabular data"
DESCRIPTION = "The datamatrix package provides a high way to work with tabular data in Python. \
Tabular data is datasets that consist of named columns and numbered rows."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-python-datamatrix-1.0.2-1.1.noarch.rpm"
RPM_HASH = "533198a00df4fb382a0db7045b233174c19f1dacf996f2003558b424f37a46515e2643b20fe8a7ed02a3286aab9f11c9448369dcf9176ab3dd7146d440a1b085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(datamatrix) \
python39-python-datamatrix \
python3dist(datamatrix)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
