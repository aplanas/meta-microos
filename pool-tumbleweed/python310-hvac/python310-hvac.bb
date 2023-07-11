SUMMARY = "HashiCorp Vault API client"
DESCRIPTION = "HashiCorp Vault API client for Python 2/3"
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-hvac-1.1.0-1.4.noarch.rpm"
RPM_HASH = "08a55eb0c171a0bab8e1b39d3640cd3cf38d11c52c4e4b635361a5068e3d0fa599f193b0a6ad63ce64f3ce25361414d88a5f55e60b251307522502ca82d0b03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hvac \
python310-hvac \
python3dist-hvac"

RDEPENDS:${PN} += "python-abi \
python310-pyhcl \
python310-requests"

inherit rpm
