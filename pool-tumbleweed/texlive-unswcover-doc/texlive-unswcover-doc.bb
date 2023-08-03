SUMMARY = "Documentation for texlive-unswcover"
DESCRIPTION = "This package includes the documentation for texlive-unswcover"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn66115"

RPM_NAME = "texlive-unswcover-doc-2023.209.1.0svn66115-54.1.noarch.rpm"
RPM_HASH = "34cc1b311e761ee54cbd84386abd0cbbb5b90cd15ec5e675a062ad418beab1ee6b45512d64693a93349259a97d641d9b099c0fd421753d83e2043eb25bf86d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unswcover-doc"

RDEPENDS:${PN} += ""

inherit rpm
