SUMMARY = "Documentation for texlive-gotoh"
DESCRIPTION = "This package includes the documentation for texlive-gotoh"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44764"

RPM_NAME = "texlive-gotoh-doc-2023.201.1.1svn44764-53.2.noarch.rpm"
RPM_HASH = "a2179d0433f0bf188c5bcb46fcb65ac2f47d9acdbf693e4ac07db75674364d477d1c899495a281b934c46ffc2eb264a2fce3f8666c18673d63aef8358373484d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gotoh-doc"

RDEPENDS:${PN} += ""

inherit rpm
