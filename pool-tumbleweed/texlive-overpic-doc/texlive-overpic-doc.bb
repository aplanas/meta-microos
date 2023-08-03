SUMMARY = "Documentation for texlive-overpic"
DESCRIPTION = "This package includes the documentation for texlive-overpic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53889"

RPM_NAME = "texlive-overpic-doc-2023.209.1.3svn53889-52.1.noarch.rpm"
RPM_HASH = "2f93c3d7c491c3a0f0de79f1ce736839050ddd0fed26cad8d7dcff3a38c958d01428dc961b2127a763346f10523233bd0b1661d5dd30baa68c30761d470c0f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-overpic-doc-de;en \
texlive-overpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
