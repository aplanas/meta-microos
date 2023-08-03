SUMMARY = "Documentation for texlive-philex"
DESCRIPTION = "This package includes the documentation for texlive-philex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn36396"

RPM_NAME = "texlive-philex-doc-2023.209.1.3svn36396-52.1.noarch.rpm"
RPM_HASH = "761e127ca24bc620c849415f87fedef2b54e4cec52c3e50a2d96cd1e8abaadec138177d9ae9199c9d74583fdc7cc82ce67564284abccf904d812f60fb78ad93a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-philex-doc"

RDEPENDS:${PN} += ""

inherit rpm
