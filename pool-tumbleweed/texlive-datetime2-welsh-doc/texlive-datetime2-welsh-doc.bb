SUMMARY = "Documentation for texlive-datetime2-welsh"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-welsh"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52553"

RPM_NAME = "texlive-datetime2-welsh-doc-2023.209.1.1svn52553-53.1.noarch.rpm"
RPM_HASH = "cbb17c5d1d902de94d18982dc3b1d9541eb47a3370b628a3087794368a0560921d1b7c3bc89bffd6b8866d7d6658dc05117cc1a94279ff0310b317a117b318fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-welsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
