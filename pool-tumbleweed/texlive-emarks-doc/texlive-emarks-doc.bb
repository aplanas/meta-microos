SUMMARY = "Documentation for texlive-emarks"
DESCRIPTION = "This package includes the documentation for texlive-emarks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24504"

RPM_NAME = "texlive-emarks-doc-2023.209.1.0svn24504-54.2.noarch.rpm"
RPM_HASH = "d5556adca515cbce26efcb0eeb9c9102faf93981f3250e581ceb5600fdf05232ef89b5218ed7e0ae430ec0ea2b6e51ab2f76732dd079a724102e686ef607eaae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emarks-doc"

RDEPENDS:${PN} += ""

inherit rpm
