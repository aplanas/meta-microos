SUMMARY = "Avocado Plugin for Execution of golang tests"
DESCRIPTION = "This plugin allows Avocado to list golang tests, and if golang is installed, \
to also run them."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-golang-69.0-6.10.noarch.rpm"
RPM_HASH = "31552990d45d918b0b2fbdf07b856a0a8364dc12a02bd8643837aa0e87fc9f21ebc980d9f2358d3d85ab334981419dd4f948470c16f5db458161d276ff9e777c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-golang \
python3.10dist(avocado-framework-plugin-golang) \
python3dist(avocado-framework-plugin-golang)"

RDEPENDS:${PN} += "go \
python(abi) \
python3-avocado"

inherit rpm
