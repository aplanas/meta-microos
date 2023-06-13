SUMMARY = "Documentation for texlive-lualatex-truncate"
DESCRIPTION = "This package includes the documentation for texlive-lualatex-truncate"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48469"

RPM_NAME = "texlive-lualatex-truncate-doc-2023.201.1.1svn48469-52.1.noarch.rpm"
RPM_HASH = "1879387326b07759a5e201d7a353ef09893b4f6fcf9a9a78b9ab4a35c3958f26db43256f536fef2d5525459722806572616c086d2875b4436bebfcc65b451e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualatex-truncate-doc"

RDEPENDS:${PN} += ""

inherit rpm
