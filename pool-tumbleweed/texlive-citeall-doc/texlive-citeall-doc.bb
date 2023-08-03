SUMMARY = "Documentation for texlive-citeall"
DESCRIPTION = "This package includes the documentation for texlive-citeall"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn45975"

RPM_NAME = "texlive-citeall-doc-2023.209.1.4svn45975-54.1.noarch.rpm"
RPM_HASH = "62061bace5cc03827cfb5ec8422960515fc81526d756059cf34f3e765842a6b90921760f2b8047c0ac83710814e83fd06fd1989763abe01f70dc0a557a6fea65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-citeall-doc"

RDEPENDS:${PN} += ""

inherit rpm
