SUMMARY = "Documentation for texlive-gmdoc"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.993svn21292"

RPM_NAME = "texlive-gmdoc-doc-2023.209.0.0.993svn21292-54.2.noarch.rpm"
RPM_HASH = "56f006c7c94c5284634099e14a58ecde14e6e4df3808976a3f930aa989a75242055acc1f21d6b8b6c19c881c216b967b61ec540aead3220876831dc336bdbbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
