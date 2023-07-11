SUMMARY = "Documentation for texlive-wrapfig"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn61719"

RPM_NAME = "texlive-wrapfig-doc-2023.201.3.6svn61719-52.2.noarch.rpm"
RPM_HASH = "4d595bfa0d119ee8346574f682c9ef76ca784b3a01e43ec18e9f7744827231920d5b3232b2595a0e2b3b18285aa9a50cc9af221f18ba830bf5158ebd33cbd1f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
