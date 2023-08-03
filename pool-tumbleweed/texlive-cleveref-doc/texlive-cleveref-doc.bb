SUMMARY = "Documentation for texlive-cleveref"
DESCRIPTION = "This package includes the documentation for texlive-cleveref"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21.4svn61719"

RPM_NAME = "texlive-cleveref-doc-2023.209.0.0.21.4svn61719-54.1.noarch.rpm"
RPM_HASH = "a5383f4aafd8b0d2965c8598cb50b0688ea4c407ce84f8369cc375f0148089ac622055cd14900a5c6bc62feb1f97e9cc9ede8504f21f898a64270d18a06d5536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cleveref-doc"

RDEPENDS:${PN} += ""

inherit rpm
