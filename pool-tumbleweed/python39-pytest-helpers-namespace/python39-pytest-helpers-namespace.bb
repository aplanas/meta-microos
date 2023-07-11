SUMMARY = "PyTest Helpers Namespace"
DESCRIPTION = "PyTest Helpers Namespace."
LICENSE = "Apache-2.0"

PV = "2021.12.29"

RPM_NAME = "python39-pytest-helpers-namespace-2021.12.29-1.3.noarch.rpm"
RPM_HASH = "44e2acb832249d571f00522388785824c1cd8c87ced9cc88f9a2dda46f79171fea23fde2e21cafe931923b1012aeec27e6aa7b8cdaa5c71a1d6e8798c729b64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-helpers-namespace \
python39-pytest-helpers-namespace \
python3dist-pytest-helpers-namespace"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
