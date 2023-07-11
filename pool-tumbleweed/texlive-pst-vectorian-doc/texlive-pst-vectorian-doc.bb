SUMMARY = "Documentation for texlive-pst-vectorian"
DESCRIPTION = "This package includes the documentation for texlive-pst-vectorian"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn60488"

RPM_NAME = "texlive-pst-vectorian-doc-2023.201.0.0.41svn60488-53.2.noarch.rpm"
RPM_HASH = "9cb2ab2cf944fd6e882eae2c58b339e077ae7474377168ec478e539b25d90e5a29137f871ea8d1f17453e5e125aee891a146b655309c43110a4f02a5533de76a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-vectorian-doc-fr \
texlive-pst-vectorian-doc"

RDEPENDS:${PN} += ""

inherit rpm
