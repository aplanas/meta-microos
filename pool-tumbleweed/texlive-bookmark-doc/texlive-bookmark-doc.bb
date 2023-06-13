SUMMARY = "Documentation for texlive-bookmark"
DESCRIPTION = "This package includes the documentation for texlive-bookmark"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.29svn56885"

RPM_NAME = "texlive-bookmark-doc-2023.201.1.29svn56885-52.1.noarch.rpm"
RPM_HASH = "182c2f4351b84ecef3e31e70606ca03f52a3950d1c91163f6a12c0acca3aae224ddedc76dc7178c2a4a78dc0042ea8a4387246b2b883ac2b1dcc216b16f98778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
