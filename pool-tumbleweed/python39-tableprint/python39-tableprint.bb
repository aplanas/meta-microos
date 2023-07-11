SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-tableprint-0.9.1-3.5.noarch.rpm"
RPM_HASH = "f5992b3e3cb360366f09f327d748875df4ef94c7f70d798e59930cdc3304391b43296ddb633b42423a596e9a5fa87a18ce11957e16ff7a666acf644ca3ad00b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tableprint \
python39-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-wcwidth"

inherit rpm
