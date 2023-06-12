SUMMARY = "Documentation for texlive-xpicture"
DESCRIPTION = "This package includes the documentation for texlive-xpicture"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn28770"

RPM_NAME = "texlive-xpicture-doc-2023.201.1.2asvn28770-52.1.noarch.rpm"
RPM_HASH = "e3db59386952bc5990c761926ae19e5170abedd16e63fc31c88fb6d976ba7fc3eca51fd38aa7a917b7ff87656d5c0c5d58aeb19497c461c87a347e4ab07f7747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpicture-doc"
RDEPENDS:${PN} += ""

inherit rpm
