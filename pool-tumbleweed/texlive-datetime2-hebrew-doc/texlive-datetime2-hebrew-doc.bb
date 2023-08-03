SUMMARY = "Documentation for texlive-datetime2-hebrew"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-hebrew"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47534"

RPM_NAME = "texlive-datetime2-hebrew-doc-2023.209.1.1svn47534-53.1.noarch.rpm"
RPM_HASH = "1a8baec59dd6fdd32cc63b3c802c7285a62eac0831cc5a51df5a895c89c3a1743d22a9be45d64df6a040d2b84036789434709f2e4a6453c9805e1627f5d00f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-hebrew-doc"

RDEPENDS:${PN} += ""

inherit rpm
