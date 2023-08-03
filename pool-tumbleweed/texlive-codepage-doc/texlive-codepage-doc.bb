SUMMARY = "Documentation for texlive-codepage"
DESCRIPTION = "This package includes the documentation for texlive-codepage"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn51502"

RPM_NAME = "texlive-codepage-doc-2023.209.svn51502-54.1.noarch.rpm"
RPM_HASH = "2479807cf80e85660dae043a7bd27b37ee41ddd7d5f3561c6780b0a833309b70ce4efaeccf8005b30121e38328dd306d30b4cfa8aaa367de1a6e36b49505bd93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-codepage-doc-fr;en \
texlive-codepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
