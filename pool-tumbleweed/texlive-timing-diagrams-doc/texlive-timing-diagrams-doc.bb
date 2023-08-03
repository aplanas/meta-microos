SUMMARY = "Documentation for texlive-timing-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-timing-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn31491"

RPM_NAME = "texlive-timing-diagrams-doc-2023.209.svn31491-53.1.noarch.rpm"
RPM_HASH = "2f5deeeb610750caae764a7d3dc16b9014202b65ed396c5b1eaf1dcd3843e6a50281602bc59b827bf842905a84ef176a6dbb7d3484b8a500a1452f078a061a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-timing-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
