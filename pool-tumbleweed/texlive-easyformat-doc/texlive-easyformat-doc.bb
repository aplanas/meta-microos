SUMMARY = "Documentation for texlive-easyformat"
DESCRIPTION = "This package includes the documentation for texlive-easyformat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-doc-2023.209.1.4.0svn44543-54.1.noarch.rpm"
RPM_HASH = "2b5fb0afb7b68a4153985fa2743df2b034972cda670997dbf7b15f5d4ff4fd4b71d8371ececb0c95792104c6905afa27df669dce6a4907166308a9d57c3dbc84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyformat-doc"

RDEPENDS:${PN} += ""

inherit rpm
