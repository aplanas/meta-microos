SUMMARY = "Documentation for texlive-boxedminipage"
DESCRIPTION = "This package includes the documentation for texlive-boxedminipage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54827"

RPM_NAME = "texlive-boxedminipage-doc-2023.209.1.1svn54827-53.1.noarch.rpm"
RPM_HASH = "7256def42ecda7ef4f300a0692d3b3c7000ffce6e9d3275e4729dfd585742af73988174838f6d07c8587dd19a78d4be597b4bb736ad55c7d061f45721fbaa5f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boxedminipage-doc"

RDEPENDS:${PN} += ""

inherit rpm
