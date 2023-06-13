SUMMARY = "Python module for creating testable command-line interfaces"
DESCRIPTION = "Cleo allows you to create beautiful and testable command-line interfaces."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-cleo-2.0.1-2.1.noarch.rpm"
RPM_HASH = "530e02dd96cd600ab18e8dbcaa7ca90bf2405d5ba8172dfa98270fea97e95f80857a1dff3604849ddbc305b31de8aa77c81167bea812695273c40dcd9115d2f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cleo) \
python311-cleo \
python3dist(cleo)"

RDEPENDS:${PN} += "python(abi) \
python311-crashtest \
python311-pylev \
python311-rapidfuzz"

inherit rpm
