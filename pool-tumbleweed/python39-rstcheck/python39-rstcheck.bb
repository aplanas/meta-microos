SUMMARY = "Python module to check syntax of reStructuredText"
DESCRIPTION = "A Python module to check the syntax of reStructuredText and code \
blocks nested within it."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python39-rstcheck-3.3.1-5.13.noarch.rpm"
RPM_HASH = "3016054d8b05bc18f3fc0bbf2524a496a6cc95a176f08b70da1736ac869cba6a934c3b33f2a88f1fae155fbaa1b23c8e4b9a79296391562d912d60793b0fa325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rstcheck \
python39-rstcheck \
python3dist-rstcheck \
rstcheck"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docutils \
update-alternatives"

inherit rpm
