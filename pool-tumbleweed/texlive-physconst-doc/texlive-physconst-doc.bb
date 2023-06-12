SUMMARY = "Documentation for texlive-physconst"
DESCRIPTION = "This package includes the documentation for texlive-physconst"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn58727"

RPM_NAME = "texlive-physconst-doc-2023.201.1.1.2svn58727-51.1.noarch.rpm"
RPM_HASH = "1739b1b375b5c5772e8c2f46134847226493f97ee7aa2434fe39e0291f90c287f170f0c883bdc976bb8750dcbe51cf7076416b2433c8c6d50103f53c98bba887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physconst-doc"
RDEPENDS:${PN} += ""

inherit rpm
