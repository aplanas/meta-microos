SUMMARY = "Documentation for texlive-biblatex-mla"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-mla"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1asvn62138"

RPM_NAME = "texlive-biblatex-mla-doc-2023.201.2.1asvn62138-53.1.noarch.rpm"
RPM_HASH = "92f2823e8b11e9f004070749d4bb4f98bbd84d0528fea3ab96eef20002c05c96478a063bf35f6faf40ea3796cbb8a2d3ff9500c45444209c639654aa8a213c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-mla-doc"

RDEPENDS:${PN} += ""

inherit rpm
