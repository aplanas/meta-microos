SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python39-Flask-doc-2.2.5-1.3.noarch.rpm"
RPM_HASH = "648c2ba5ae6c541293c56ced7f957dfc1a110982b270205bb1ab279d789c8834460c70546671fd06ed0ed29a1990b7dedb3c1cdb10839fc8fd21fe0d4beef18b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Flask-doc"

RDEPENDS:${PN} += "python39-Flask"

inherit rpm
