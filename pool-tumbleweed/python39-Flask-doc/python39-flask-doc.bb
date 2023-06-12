SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python39-Flask-doc-2.2.5-1.1.noarch.rpm"
RPM_HASH = "6d158835b2980a125828164f76c616b8dfdaecd8207730ba8fad0406db9328a59a866d4ea3aacf4b3af9055b7b5752750d5635e8c55b14640723a22bb57ddaf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Flask-doc"
RDEPENDS:${PN} += "python39-Flask"

inherit rpm
