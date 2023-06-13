SUMMARY = "Sphinx extension to add a warning banner"
DESCRIPTION = "Sphinx extension to add a warning banner"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-sphinx-version-warning-1.1.2-2.1.noarch.rpm"
RPM_HASH = "56e5ed83e287d6c0f52b865807ed3c50c4f42647e0f5a857cd1d635fb2a15ce6814014194d137778c61051b30237e154ef906418a099fdd217c2c7ce587ea163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-version-warning) \
python39-sphinx-version-warning \
python3dist(sphinx-version-warning)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
