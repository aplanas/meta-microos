SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python39-Flask-doc-2.3.2-2.1.noarch.rpm"
RPM_HASH = "173771348bd4af1378bda4bf7fd5def3157c9ff1f2a2f965c88b6bad648df0fa917bab4979b151dd268bed9f3611799b61f6cbc27a0ecc1f1b30ab5813ec4576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Flask-doc"

RDEPENDS:${PN} += "python39-Flask"

inherit rpm
