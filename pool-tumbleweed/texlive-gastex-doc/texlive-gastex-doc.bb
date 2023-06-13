SUMMARY = "Documentation for texlive-gastex"
DESCRIPTION = "This package includes the documentation for texlive-gastex"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn58505"

RPM_NAME = "texlive-gastex-doc-2023.201.3.0svn58505-52.1.noarch.rpm"
RPM_HASH = "78cbc281b62e533c56cd5cc7ee61b4c1626b02c5c7b134ae4c04666aacd2ca5cd2172bfffc825c29eee9fa6de098e10d47b95e0d2903db08a891619a9da92700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gastex-doc"

RDEPENDS:${PN} += ""

inherit rpm
