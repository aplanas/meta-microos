SUMMARY = "Documentation for texlive-datetime2-hebrew"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-hebrew"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47534"

RPM_NAME = "texlive-datetime2-hebrew-doc-2023.201.1.1svn47534-52.1.noarch.rpm"
RPM_HASH = "a1782b7b5e65ea38e7bfdf3ce06a952a29dacab9b512ba1e6ed0b5f425e820841014a2d2a24dd79b4b146785c5daad0bfe438cc88a3e7e6e4643c22d08cd1ecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-hebrew-doc"

RDEPENDS:${PN} += ""

inherit rpm
