SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-promise-2.3.0-4.3.noarch.rpm"
RPM_HASH = "94b28fdd5ab57fb86f4bf2a2d107c7533bf573a3fbc3631bfeabd1fa149f6e798f7bd1b20d9021ac782ecd375a670a957660032b1123c33536c785f96dd61503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-promise \
python39-promise \
python3dist-promise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
