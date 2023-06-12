SUMMARY = "Documentation for texlive-aomart"
DESCRIPTION = "This package includes the documentation for texlive-aomart"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.27svn63442"

RPM_NAME = "texlive-aomart-doc-2023.201.1.27svn63442-54.1.noarch.rpm"
RPM_HASH = "9813b938ae9243eac9c86d8c5f09fba1da922e01779435ac072e7d45b169054c7bb55aac7e79074735c9249eaa30c8777b27ad84b86d70097b870cd0232ca3c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aomart-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
