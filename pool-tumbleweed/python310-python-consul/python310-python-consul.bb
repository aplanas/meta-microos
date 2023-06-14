SUMMARY = "Python client for https://www.consul.io/"
DESCRIPTION = "Python client for `Consul.io <http://www.consul.io/>`_"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-python-consul-1.1.0-2.9.noarch.rpm"
RPM_HASH = "d8bcb1a98272db7699c1d9248193a2d30affb9d2618a4c04ff05d912fe2f9d0d4c4a0d72efb039dd6d50245dd4b21d8312c8ade2650539c8c495427f9cfcd904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-consul \
python3.10dist-python-consul \
python310-python-consul \
python3dist-python-consul"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-six"

inherit rpm
