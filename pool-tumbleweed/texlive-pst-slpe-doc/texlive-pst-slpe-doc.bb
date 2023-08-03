SUMMARY = "Documentation for texlive-pst-slpe"
DESCRIPTION = "This package includes the documentation for texlive-pst-slpe"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.31svn24391"

RPM_NAME = "texlive-pst-slpe-doc-2023.209.1.31svn24391-54.1.noarch.rpm"
RPM_HASH = "4f2a626b627a537b53968ff834460fd03cb8edf1af5e033861c0ce1bab765d2b2be3c05fdb638a74773d7d69783a009e8a063af54b1eafdf27f2fc82329bc8dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-slpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
