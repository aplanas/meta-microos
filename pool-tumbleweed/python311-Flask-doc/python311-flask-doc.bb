SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python311-Flask-doc-2.2.5-1.1.noarch.rpm"
RPM_HASH = "f81478508910c9d9869992d738edcb049b4159e599e40dd6a3e7da1714fbcd374569fb780909fa7838fa2873bfc6a2ea710890e5485dd1dccae8e80a22181d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Flask-doc"

RDEPENDS:${PN} += "python311-Flask"

inherit rpm
