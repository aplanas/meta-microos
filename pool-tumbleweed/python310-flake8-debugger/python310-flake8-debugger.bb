SUMMARY = "ipdb/pdb statement checker plugin for flake8"
DESCRIPTION = "ipdb/pdb statement checker plugin for flake8"
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python310-flake8-debugger-4.1.2-1.3.noarch.rpm"
RPM_HASH = "3447fb5521ecf27e597710b08f7b55bc3fc7e319f26f4a4d0b2943c43cd9368239dbcb06b660e07515b67367eb3453715c976dd84f3e8120c6027c45fa3aa852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-debugger \
python3.10dist(flake8-debugger) \
python310-flake8-debugger \
python3dist(flake8-debugger)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
