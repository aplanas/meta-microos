SUMMARY = "Documentation for texlive-revtex4"
DESCRIPTION = "This package includes the documentation for texlive-revtex4"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0asvn56589"

RPM_NAME = "texlive-revtex4-doc-2023.209.4.0asvn56589-54.2.noarch.rpm"
RPM_HASH = "1b04c9e98e375b6d5af9211098aa778f7a9245ebb6929ee9ded921a5017bce1a9b360089a3861121e320fab2873933198c9ebcb9fcf0781fb21d6093610676f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-doc"

RDEPENDS:${PN} += ""

inherit rpm
