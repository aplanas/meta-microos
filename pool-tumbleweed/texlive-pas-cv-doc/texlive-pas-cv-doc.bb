SUMMARY = "Documentation for texlive-pas-cv"
DESCRIPTION = "This package includes the documentation for texlive-pas-cv"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01svn32263"

RPM_NAME = "texlive-pas-cv-doc-2023.209.2.01svn32263-52.1.noarch.rpm"
RPM_HASH = "5df7ee092993497d440a3f290c58d29218f65be1ab5567ca8b270a279081a6d0b0c97ab5f1a5c3da834ee2714c796a78f59984e879c0c9ea31b5f59ec25d2645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pas-cv-doc-fr \
texlive-pas-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
