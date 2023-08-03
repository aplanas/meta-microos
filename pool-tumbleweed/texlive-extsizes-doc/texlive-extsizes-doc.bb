SUMMARY = "Documentation for texlive-extsizes"
DESCRIPTION = "This package includes the documentation for texlive-extsizes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4asvn17263"

RPM_NAME = "texlive-extsizes-doc-2023.209.1.4asvn17263-53.1.noarch.rpm"
RPM_HASH = "2af69d552c4ea862f2357282e932bbd41f7d7030e374352ead77523998a24270bfe6ec97014b3b9aa18bd0c3b52cba953747b17530bbf5d1dc55d939fc50bc23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extsizes-doc"

RDEPENDS:${PN} += ""

inherit rpm
