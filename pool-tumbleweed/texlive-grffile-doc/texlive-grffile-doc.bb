SUMMARY = "Documentation for texlive-grffile"
DESCRIPTION = "This package includes the documentation for texlive-grffile"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn52756"

RPM_NAME = "texlive-grffile-doc-2023.201.2.1svn52756-53.1.noarch.rpm"
RPM_HASH = "3f38f5a8614150521ed75a1c54e225d50b3fa300895e330138ba0ec494937ec4b0cbcef0d133bd6127b3a1dd20c560056ba3d7d2f7e8b763367a6ae5d5c2529f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grffile-doc"

RDEPENDS:${PN} += ""

inherit rpm
