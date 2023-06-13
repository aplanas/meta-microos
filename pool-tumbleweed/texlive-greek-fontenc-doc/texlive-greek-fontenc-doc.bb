SUMMARY = "Documentation for texlive-greek-fontenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-fontenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn66513"

RPM_NAME = "texlive-greek-fontenc-doc-2023.201.2.2.1svn66513-53.1.noarch.rpm"
RPM_HASH = "f9635e1a4a8860e9fee982167c8959bb2157aac098c99076a93843959749174bb233375efb1571d6550a8c6c7f94bc6130f9e794a2e782999ca8ab61e5ffcd87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-fontenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
