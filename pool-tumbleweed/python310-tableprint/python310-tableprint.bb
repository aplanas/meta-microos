SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-tableprint-0.9.1-4.1.noarch.rpm"
RPM_HASH = "b87f7fc3800f44d1668a16484b083e191b7f1f3c3f029679b3fdc7e34fb4e01df3e69b35f55d9079197f12278b5cc25939ad8d4c1cedbcb8b8cccb7db8f7aee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tableprint \
python310-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python310-wcwidth"

inherit rpm
