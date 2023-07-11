SUMMARY = "PyTest Helpers Namespace"
DESCRIPTION = "PyTest Helpers Namespace."
LICENSE = "Apache-2.0"

PV = "2021.12.29"

RPM_NAME = "python311-pytest-helpers-namespace-2021.12.29-1.3.noarch.rpm"
RPM_HASH = "118090c65c3292b5a9f9c45d5cfd64019537793232886f06628b5688876eb2282b47188b54b938cba08e9ff41dfd23019a1f4b092206b74b623b863bc62f5724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-helpers-namespace \
python3.11dist-pytest-helpers-namespace \
python311-pytest-helpers-namespace \
python3dist-pytest-helpers-namespace"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
