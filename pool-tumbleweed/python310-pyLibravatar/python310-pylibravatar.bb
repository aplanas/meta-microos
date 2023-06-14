SUMMARY = "Python module for Libravatar"
DESCRIPTION = "PyLibravatar is a module for using federated Libravatar \
avatar hosting service from within Python applications."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python310-pyLibravatar-1.7-3.12.noarch.rpm"
RPM_HASH = "e2f3861fe5009ee29a39cc68005b757615189be2c32e8ff3dd8b31b94f448df564527f171a27723214fd64971b4053b545d7bf9485701402548821e88e4311f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyLibravatar \
python3.10dist-pylibravatar \
python310-pyLibravatar \
python3dist-pylibravatar"

RDEPENDS:${PN} += "python-abi \
python310-py3dns"

inherit rpm
