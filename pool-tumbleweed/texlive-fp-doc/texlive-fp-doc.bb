SUMMARY = "Documentation for texlive-fp"
DESCRIPTION = "This package includes the documentation for texlive-fp"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1dsvn49719"

RPM_NAME = "texlive-fp-doc-2023.209.2.1dsvn49719-53.1.noarch.rpm"
RPM_HASH = "786f5e85de032f5b92c35a618b39c9f63426e3e7ff9dee65263067f23500aedac444efc550932b1564721a20d9c83a7fc9605759751dfdd556991699057754e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fp-doc"

RDEPENDS:${PN} += ""

inherit rpm
