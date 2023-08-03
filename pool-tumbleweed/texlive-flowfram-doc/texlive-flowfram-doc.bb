SUMMARY = "Documentation for texlive-flowfram"
DESCRIPTION = "This package includes the documentation for texlive-flowfram"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.17svn35291"

RPM_NAME = "texlive-flowfram-doc-2023.209.1.17svn35291-53.1.noarch.rpm"
RPM_HASH = "8cc42cc17e4e15e8718833246fae3a8fabc4c960dce6c3db67f3c3b0a591852f2e57887e0c1efd632fbda71a313a4b69da70a04d92aeeb2ae21ee529ea85eae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flowfram-doc"

RDEPENDS:${PN} += ""

inherit rpm
