SUMMARY = "Plugin for test data directories and files"
DESCRIPTION = "pytest plugin for test data directories and files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python39-pytest-datadir-1.4.1-1.1.noarch.rpm"
RPM_HASH = "d4a4d3de6b109ffded3cde9462531525b78643ac7583e1e5b530e4fc2116db17a4873e75188c75b15c1132df81b203ebf3e0c9b0ea615b4eece40b4140fd8d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-datadir) \
python39-pytest-datadir \
python3dist(pytest-datadir)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
