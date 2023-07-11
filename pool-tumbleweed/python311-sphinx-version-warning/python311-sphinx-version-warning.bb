SUMMARY = "Sphinx extension to add a warning banner"
DESCRIPTION = "Sphinx extension to add a warning banner"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-sphinx-version-warning-1.1.2-2.2.noarch.rpm"
RPM_HASH = "397b91b99fa5819c270fb21ad4deafcffe5b8bff53fc91f925b5f88ee252737be969ce13b883501adce8818e0e833a24ba4e29466aec4016d2134f7adc9cca9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-version-warning \
python3.11dist-sphinx-version-warning \
python311-sphinx-version-warning \
python3dist-sphinx-version-warning"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
