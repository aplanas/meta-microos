SUMMARY = "Documentation for texlive-hopatch"
DESCRIPTION = "This package includes the documentation for texlive-hopatch"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn65491"

RPM_NAME = "texlive-hopatch-doc-2023.209.1.5svn65491-54.2.noarch.rpm"
RPM_HASH = "b72972520e4271036a84f46d62af5b75ba6b6851de628acb0e4aef75a04d8a4e05bfe48c7464f30d424236dab395f4d0b87701e2b7f57e5a7154416be5b68202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hopatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
