SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-tableprint-0.9.1-3.3.noarch.rpm"
RPM_HASH = "928b9c78db56b93ab59a1a8b38ef83482db61213bd2f2c5fd83962a1906113c5dc4ca37292b8eb69c128865bde21fa13acd8c7253cacd90bbe81f8626a7d71a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tableprint \
python39-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-wcwidth"

inherit rpm
