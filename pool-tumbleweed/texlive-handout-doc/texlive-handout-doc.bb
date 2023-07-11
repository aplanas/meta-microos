SUMMARY = "Documentation for texlive-handout"
DESCRIPTION = "This package includes the documentation for texlive-handout"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.0svn43962"

RPM_NAME = "texlive-handout-doc-2023.201.1.6.0svn43962-53.2.noarch.rpm"
RPM_HASH = "2c51a416496dcc5cddcd251ddb147d81297e2980c5ca5584649f3612fdbabb3bb35a7ad6cc2f8b434c4a4c8527498582377c5e8d801997257ff16801b76900be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handout-doc"

RDEPENDS:${PN} += ""

inherit rpm
