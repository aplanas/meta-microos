SUMMARY = "HashiCorp Vault API client"
DESCRIPTION = "HashiCorp Vault API client for Python 2/3"
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-hvac-1.1.0-1.2.noarch.rpm"
RPM_HASH = "92d4790f9b4b352f35f9e8168a7612db603e35fa113fdd292d59ad56243d7a3a62c3e65a3dda4b183f4ae8ff49dad1e73aeb90f6c5d14ffc548eecf4c61498ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hvac \
python3.10dist-hvac \
python310-hvac \
python3dist-hvac"

RDEPENDS:${PN} += "python-abi \
python310-pyhcl \
python310-requests"

inherit rpm
