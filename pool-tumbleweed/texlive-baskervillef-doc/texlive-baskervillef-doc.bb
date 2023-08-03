SUMMARY = "Documentation for texlive-baskervillef"
DESCRIPTION = "This package includes the documentation for texlive-baskervillef"
LICENSE = "OFL-1.1"

PV = "2023.209.1.051svn55475"

RPM_NAME = "texlive-baskervillef-doc-2023.209.1.051svn55475-54.1.noarch.rpm"
RPM_HASH = "cc67190478a827e368b1286cacc7401c507e125a5683d7056c8b34181879ff359a7e362fec2ed0b957d119bdfb1d7c82fd9ffde51a802b7a80a7c1840b53dcce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baskervillef-doc"

RDEPENDS:${PN} += ""

inherit rpm
