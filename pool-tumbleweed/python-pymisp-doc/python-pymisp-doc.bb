SUMMARY = "Examples and Documentation for python-pymisp"
DESCRIPTION = "Examples and HTML documentation for python-pymisp."
LICENSE = "BSD-2-Clause"

PV = "2.4.166"

RPM_NAME = "python-pymisp-doc-2.4.166-1.5.noarch.rpm"
RPM_HASH = "0c1e7966740c19189d8778920a4c6f84fc7277290b9ff20656e656343db9b93cce9071df28f6af80d512298c209b37c34054b86ba599c7df5f199123981e5ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pymisp-doc"

RDEPENDS:${PN} += ""

inherit rpm
