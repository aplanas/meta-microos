SUMMARY = "Documentation for texlive-biblatex-gost"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-gost"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.22svn59135"

RPM_NAME = "texlive-biblatex-gost-doc-2023.201.1.22svn59135-53.1.noarch.rpm"
RPM_HASH = "d8734b286685c82fab4ddd4dbe207d07133a229ddf4a798b6ce2f96179ca62616310e78efff49dc36d5710bd22b7bfff93422f3fc8d24f0f8aab8919122a3a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-gost-doc-ru \
texlive-biblatex-gost-doc"

RDEPENDS:${PN} += ""

inherit rpm
