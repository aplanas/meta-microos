SUMMARY = "PyTest Helpers Namespace"
DESCRIPTION = "PyTest Helpers Namespace."
LICENSE = "Apache-2.0"

PV = "2021.12.29"

RPM_NAME = "python310-pytest-helpers-namespace-2021.12.29-1.1.noarch.rpm"
RPM_HASH = "8c09aae0acb7a89c8854ee8fa8396e4ab59d577122109f198a6396687f741e8c47ac47c5fd717d2bb1d98d5879fb35964d9d82641ba70dcc6199f1993951f84c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-helpers-namespace \
python3.10dist-pytest-helpers-namespace \
python310-pytest-helpers-namespace \
python3dist-pytest-helpers-namespace"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
