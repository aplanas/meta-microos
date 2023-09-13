SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-tableprint-0.9.1-4.1.noarch.rpm"
RPM_HASH = "3d60849ed6eb6d21ac7ada18de7639c9e59a9675522a4eafa650f1353f48bcfa9d816a40680e5c0c453f0e203c9ffbce08a547b9229ac00f23c3fa844c10717a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tableprint \
python39-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python39-wcwidth"

inherit rpm
