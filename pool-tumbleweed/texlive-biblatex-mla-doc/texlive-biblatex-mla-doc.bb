SUMMARY = "Documentation for texlive-biblatex-mla"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-mla"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1asvn62138"

RPM_NAME = "texlive-biblatex-mla-doc-2023.209.2.1asvn62138-54.1.noarch.rpm"
RPM_HASH = "5eb7ef3ccf8a4f5b4539576051a981c33a08421e2c09925cc54cb8d7fdd33f624b191166d74fdc39c6a26860b99d07995265ff33b66574c8926509baeaab8b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-mla-doc"

RDEPENDS:${PN} += ""

inherit rpm
