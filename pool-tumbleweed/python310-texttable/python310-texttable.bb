SUMMARY = "Module for creating simple ASCII tables"
DESCRIPTION = "texttable is a module to generate a formatted text table, using ASCII \
characters."
LICENSE = "MIT"

PV = "1.6.7"

RPM_NAME = "python310-texttable-1.6.7-2.1.noarch.rpm"
RPM_HASH = "cfc3a6925f6a0225d058c938d9c4b337b4a9051a7b1e8b3fc35cb24bf4f15d812a8fe56fb44be577347e7ddcc0511e28867d29218e0214d76f186d01dde3f6dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-texttable \
python310-texttable \
python3dist-texttable"

RDEPENDS:${PN} += "python-abi \
python310-base"

inherit rpm
