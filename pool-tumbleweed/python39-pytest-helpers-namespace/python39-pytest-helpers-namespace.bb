SUMMARY = "PyTest Helpers Namespace"
DESCRIPTION = "PyTest Helpers Namespace."
LICENSE = "Apache-2.0"

PV = "2021.12.29"

RPM_NAME = "python39-pytest-helpers-namespace-2021.12.29-1.1.noarch.rpm"
RPM_HASH = "fffa5f607f7116c1daba559d8b838e139eaf3a2ee4293bbe89d815afbf07bf36d229718b7814fee6bf7045f92593fe370552fecb78a19ea3aaf6615af135e4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-helpers-namespace \
python39-pytest-helpers-namespace \
python3dist-pytest-helpers-namespace"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
