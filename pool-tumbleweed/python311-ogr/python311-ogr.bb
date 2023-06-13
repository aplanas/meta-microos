SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "python311-ogr-0.41.0-1.3.noarch.rpm"
RPM_HASH = "7b67869bf972843a3c2236c87e06a63d779e9ce9695fbedfea49672dad7785877fdba7eba969c99159e47dbc5596113ae4f12da70b57d188065234ab41b7f595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ogr) \
python311-ogr \
python3dist(ogr)"

RDEPENDS:${PN} += "python(abi) \
python311-Deprecated \
python311-GitPython \
python311-PyGithub \
python311-PyYAML \
python311-cryptography \
python311-python-gitlab \
python311-requests"

inherit rpm
