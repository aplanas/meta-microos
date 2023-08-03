SUMMARY = "Documentation for texlive-nnext"
DESCRIPTION = "This package includes the documentation for texlive-nnext"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0svn56575"

RPM_NAME = "texlive-nnext-doc-2023.209.0.0.0svn56575-55.1.noarch.rpm"
RPM_HASH = "a0723c72c474485421651a4824340d50a327094cb98198b37a7ed7469ce96a99a16cad605a88ff78d0fcb76058d410b142c8bb53442b254032098b1730d8c4a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nnext-doc"

RDEPENDS:${PN} += ""

inherit rpm
