SUMMARY = "Documentation for texlive-pst-spinner"
DESCRIPTION = "This package includes the documentation for texlive-pst-spinner"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-doc-2023.209.1.02svn66115-54.1.noarch.rpm"
RPM_HASH = "2e06b1a8250500deeb6cadf3c5c6f13f993508717a0564df710d8920c63581e45fcc02d724f141aadaada6dcfe8c59ad1b615b445d39d1183e81b6de3f9724c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-spinner-doc"

RDEPENDS:${PN} += ""

inherit rpm
