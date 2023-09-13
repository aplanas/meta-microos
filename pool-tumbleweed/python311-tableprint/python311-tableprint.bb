SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-tableprint-0.9.1-4.1.noarch.rpm"
RPM_HASH = "6e1f261b2f0033aadac08d3473237b1817570352aa5e198b2b42b6a05e83e6e9739e0aab683a010d0f5b3cd734b39907fc08ee05478abb55987845fda9af5863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tableprint \
python3.11dist-tableprint \
python311-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python311-wcwidth"

inherit rpm
