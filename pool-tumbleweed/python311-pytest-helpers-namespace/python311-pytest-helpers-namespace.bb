SUMMARY = "PyTest Helpers Namespace"
DESCRIPTION = "PyTest Helpers Namespace."
LICENSE = "Apache-2.0"

PV = "2021.12.29"

RPM_NAME = "python311-pytest-helpers-namespace-2021.12.29-1.1.noarch.rpm"
RPM_HASH = "92db0b2fe1c3f66d080cf78f8d38b57756b1d23a5f46acf1d2432d43a8c28a86e6ce2ca62fcc70b9b22e72e53732f3582b2c296fefb42f1a4ea74ab8e91ed728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-helpers-namespace \
python311-pytest-helpers-namespace \
python3dist-pytest-helpers-namespace"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
