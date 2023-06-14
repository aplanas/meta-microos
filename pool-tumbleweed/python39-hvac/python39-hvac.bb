SUMMARY = "HashiCorp Vault API client"
DESCRIPTION = "HashiCorp Vault API client for Python 2/3"
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-hvac-1.1.0-1.2.noarch.rpm"
RPM_HASH = "87af2408513055c6bb9f9446f3a629f71cf5d2d5115d840aa59bc9060a77b1b232cbcfc42048dee03f3bc2d2f990b30e7a9087674bfa47ed820211272d44eb34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hvac \
python39-hvac \
python3dist-hvac"

RDEPENDS:${PN} += "python-abi \
python39-pyhcl \
python39-requests"

inherit rpm
