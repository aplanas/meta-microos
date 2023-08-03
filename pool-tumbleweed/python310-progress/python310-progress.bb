SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6"

RPM_NAME = "python310-progress-1.6-2.1.noarch.rpm"
RPM_HASH = "ec91352e51975c193aa1a67a0cc0b2ba33894418c600bcb97d6e269ed7a9080417d027c975078c1471456ab99ce55b4bb87b7d1ddbdffa5f5035a41e354a61f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-progress \
python310-progress \
python3dist-progress"

RDEPENDS:${PN} += "python-abi"

inherit rpm
