SUMMARY = "Documentation for texlive-colortab"
DESCRIPTION = "This package includes the documentation for texlive-colortab"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn22155"

RPM_NAME = "texlive-colortab-doc-2023.209.1.0svn22155-54.1.noarch.rpm"
RPM_HASH = "0dbdce5e756da352bf6b5069eda0256a0fd265602822f163eda295ce33deb11c56d7eb903dbc9e38763aea6f14c4856653a7fb218031e47460480c0c3d2f4072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colortab-doc"

RDEPENDS:${PN} += ""

inherit rpm
