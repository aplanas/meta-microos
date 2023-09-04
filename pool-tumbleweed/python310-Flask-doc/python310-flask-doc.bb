SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python310-Flask-doc-2.3.2-1.1.noarch.rpm"
RPM_HASH = "b4aecd4ceab586ee639aace493d8bceedbdbcaae0b00e6706760757e6811c9cc20cb58ec41a30449410ac99f95c6e25f5d117ce3f1612e4e9cd3dda5d0141801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Flask-doc"

RDEPENDS:${PN} += "python310-Flask"

inherit rpm
