SUMMARY = "Spyder extensions for the python-language-server"
DESCRIPTION = "Spyder extensions for the python-lsp-server"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-pyls-spyder-0.4.0-1.9.noarch.rpm"
RPM_HASH = "537750f2973fa81e72de8e882efa5c7717837b4bd2276dd0e637db655abb3e5558b381f7ced13d4bb09c0f3ab7e2fd511c3603c830d832556b0f4a5f7d70997c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyls-spyder \
python3.11dist-pyls-spyder \
python311-pyls-spyder \
python3dist-pyls-spyder"

RDEPENDS:${PN} += "python-abi \
python311-python-lsp-server"

inherit rpm
