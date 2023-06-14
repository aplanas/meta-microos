SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-tableprint-0.9.1-3.3.noarch.rpm"
RPM_HASH = "e15c5d9ae46fc052eea6a76a94c61a2b19761a8730cd56a5c8fd43e39301b3c278312c75b9e6aa65171ffcad3ffe8e65f3d1d3de57cc8ff9d50f7dda6ace80d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tableprint \
python3.10dist-tableprint \
python310-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-wcwidth"

inherit rpm
