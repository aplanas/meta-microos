SUMMARY = "Documentation for texlive-bfh-ci"
DESCRIPTION = "This package includes the documentation for texlive-bfh-ci"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.5svn66461"

RPM_NAME = "texlive-bfh-ci-doc-2023.209.2.1.5svn66461-54.1.noarch.rpm"
RPM_HASH = "a2c42e95ae527eb2fe3824e1228d1dd715768ffc28e19ae1c3f477784be3b5c7129eeb2888577280dcffc44004fb241ba1c076af5b4ffd880965e4666c6a60c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bfh-ci-doc"

RDEPENDS:${PN} += ""

inherit rpm
