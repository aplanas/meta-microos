SUMMARY = "Documentation for texlive-chngcntr"
DESCRIPTION = "This package includes the documentation for texlive-chngcntr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn47577"

RPM_NAME = "texlive-chngcntr-doc-2023.209.1.1asvn47577-54.1.noarch.rpm"
RPM_HASH = "77269d46e559654471f7f259374baaf51f6c183bcfa53b3fe5a3e3b880237ca04c218b8f2b3d89a1502cb914dc76fd61305626c0fb3c473a0592e3f80e5f3cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chngcntr-doc"

RDEPENDS:${PN} += ""

inherit rpm
