SUMMARY = "Documentation for texlive-pxtatescale"
DESCRIPTION = "This package includes the documentation for texlive-pxtatescale"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn63967"

RPM_NAME = "texlive-pxtatescale-doc-2023.209.0.0.4svn63967-54.2.noarch.rpm"
RPM_HASH = "c87fc3f2a8d147a9eafa4a37170ae75b73e9df3911bae15c762903107bbe55388f335c851c7a392bdfbdeef584f155a71a4f6e33ab5c7bbeba9e4de7c45fab42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtatescale-doc"

RDEPENDS:${PN} += ""

inherit rpm
