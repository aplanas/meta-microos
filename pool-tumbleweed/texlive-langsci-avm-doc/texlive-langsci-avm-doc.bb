SUMMARY = "Documentation for texlive-langsci-avm"
DESCRIPTION = "This package includes the documentation for texlive-langsci-avm"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn66016"

RPM_NAME = "texlive-langsci-avm-doc-2023.201.0.0.3.0svn66016-55.1.noarch.rpm"
RPM_HASH = "5553b2fc8fa7bd768644a417351c2d9673dfd13843a72d635ef43db068261653fb758acf811919c022c475543c3506d9cc99dd9623db9530c87ff560273c0ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langsci-avm-doc"

RDEPENDS:${PN} += ""

inherit rpm
