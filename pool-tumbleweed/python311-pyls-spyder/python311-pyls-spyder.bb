SUMMARY = "Spyder extensions for the python-language-server"
DESCRIPTION = "Spyder extensions for the python-lsp-server"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-pyls-spyder-0.4.0-1.7.noarch.rpm"
RPM_HASH = "b09ae79d877ac29d65b9544b935ba7dd574c3920335540eeb5257c5b520f33863276495ae4fc011f72c0085542a9262658c1e44b4d992ca08da57c47d5ec01bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyls-spyder \
python311-pyls-spyder \
python3dist-pyls-spyder"

RDEPENDS:${PN} += "python-abi \
python311-python-lsp-server"

inherit rpm
