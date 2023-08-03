SUMMARY = "Documentation for texlive-sgame"
DESCRIPTION = "This package includes the documentation for texlive-sgame"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.15svn30959"

RPM_NAME = "texlive-sgame-doc-2023.209.2.15svn30959-54.1.noarch.rpm"
RPM_HASH = "05b6fc956d1748af29ae946e93a8e65ce231e993f4fe1f80ca435d11a5dddc415cc46a8a88eec47167161f280cbd2ff9947359155debb468e2804c1fe645e084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sgame-doc"

RDEPENDS:${PN} += ""

inherit rpm
