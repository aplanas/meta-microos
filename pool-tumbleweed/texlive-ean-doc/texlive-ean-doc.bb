SUMMARY = "Documentation for texlive-ean"
DESCRIPTION = "This package includes the documentation for texlive-ean"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn20851"

RPM_NAME = "texlive-ean-doc-2023.209.svn20851-54.2.noarch.rpm"
RPM_HASH = "b92cce7bae2a801b969bc9df6da0684d76eb0b98a489d79856554baeb2e24b44248465282cb770aa833efb6729aa254227a43245e91782872d954e6ecd618be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean-doc"

RDEPENDS:${PN} += ""

inherit rpm
