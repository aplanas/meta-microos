SUMMARY = "PyTest Helpers Namespace"
DESCRIPTION = "PyTest Helpers Namespace."
LICENSE = "Apache-2.0"

PV = "2021.12.29"

RPM_NAME = "python310-pytest-helpers-namespace-2021.12.29-1.3.noarch.rpm"
RPM_HASH = "9f695c830b20edaf1ab2052a703749475369f6d9b47381ff60b3fa536f752d183f889a85f9806536be21cf552ffd8bc447ae80cafe5cb6418ac2a1ac90177f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-helpers-namespace \
python310-pytest-helpers-namespace \
python3dist-pytest-helpers-namespace"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
