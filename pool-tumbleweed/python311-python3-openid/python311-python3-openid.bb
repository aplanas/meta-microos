SUMMARY = "OpenID support for Python"
DESCRIPTION = "This is a set of Python packages to support the use of \
the OpenID decentralized identity system in applications. \
Includes example code and support for a variety of storage back-ends."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python311-python3-openid-3.2.0-2.1.noarch.rpm"
RPM_HASH = "0fa2c7a0735e710a4c75d74624cd679a3213acdd750e8f9e2c2d43a0351e523ebbc552bf638118328a60d4529b6451a34b3002d7b44c0fdce9b94513dae1d09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python3-openid \
python3.11dist-python3-openid \
python311-python3-openid \
python3dist-python3-openid"

RDEPENDS:${PN} += "python-abi \
python311-defusedxml"

inherit rpm
