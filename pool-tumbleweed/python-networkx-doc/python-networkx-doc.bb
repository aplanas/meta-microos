SUMMARY = "Documentation for python-networkx"
DESCRIPTION = "Documentation and examples for python-networkx."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python-networkx-doc-3.1-1.1.noarch.rpm"
RPM_HASH = "e4e21931c490835b2b487d3d3eaff3c3a7b9d72c97f28ec5c9a7c6bbc614a16e7699193dfcf8fc12ca7454dbe966049556710e10bd505465fb7380fa26343cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-networkx-doc \
python310-networkx-doc \
python311-networkx-doc \
python39-networkx-doc"

RDEPENDS:${PN} += ""

inherit rpm
