SUMMARY = "Spyder extensions for the python-language-server"
DESCRIPTION = "Spyder extensions for the python-lsp-server"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-pyls-spyder-0.4.0-1.9.noarch.rpm"
RPM_HASH = "e019eb062962bb408f8e74fa26255a30cff96d4022329c17bc72c7e9414bd2cf0f5b61b09a9715604dab602463cc6dab2268ba239615f7fa3f54b18aebfd798e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyls-spyder \
python310-pyls-spyder \
python3dist-pyls-spyder"

RDEPENDS:${PN} += "python-abi \
python310-python-lsp-server"

inherit rpm
