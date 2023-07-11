SUMMARY = "Module for creating simple ASCII tables"
DESCRIPTION = "texttable is a module to generate a formatted text table, using ASCII \
characters."
LICENSE = "MIT"

PV = "1.6.7"

RPM_NAME = "python311-texttable-1.6.7-2.1.noarch.rpm"
RPM_HASH = "8412c8c4e8752ea4351c92d808fe581cbb0ea2c11565c405f184fcebd8c1e73b19ec1091a34076e450098e55b9495bb5bb73132da0ff7070c5671a6913bc99af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-texttable \
python3.11dist-texttable \
python311-texttable \
python3dist-texttable"

RDEPENDS:${PN} += "python-abi \
python311-base"

inherit rpm
