SUMMARY = "Documentation for texlive-pxpgfmark"
DESCRIPTION = "This package includes the documentation for texlive-pxpgfmark"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn30212"

RPM_NAME = "texlive-pxpgfmark-doc-2023.209.0.0.2svn30212-54.2.noarch.rpm"
RPM_HASH = "790471b07447a3cdcef0cacdf8756c68b628fb2effae19a9a7a0702bef48dfb0b34a0e443da9a33d19c1e03df03a69fa7b5fb654fa15867681bc29c7e7c49341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpgfmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
