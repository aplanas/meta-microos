SUMMARY = "Documentation for texlive-figbib"
DESCRIPTION = "This package includes the documentation for texlive-figbib"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19388"

RPM_NAME = "texlive-figbib-doc-2023.209.svn19388-53.1.noarch.rpm"
RPM_HASH = "e98abd74ed53faf5ed313b2ed19b93adcf8ac4a43893ecd672551937d16f2cb6421c2ece17926197301f1fbd926d95bca93902f8a597376d76429f1aacc2e3bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
