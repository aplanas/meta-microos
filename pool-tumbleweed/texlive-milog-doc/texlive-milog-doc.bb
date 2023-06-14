SUMMARY = "Documentation for texlive-milog"
DESCRIPTION = "This package includes the documentation for texlive-milog"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41610"

RPM_NAME = "texlive-milog-doc-2023.201.1.0svn41610-54.1.noarch.rpm"
RPM_HASH = "ec403403d2e267b4e1152a16e11ea5111406f35fbebc6cdab28c9603dfaa198c9ab262372a69f32fd6a41a182c61447d19afa561687f1f2ed9ade1d477c25f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-milog-doc-de \
texlive-milog-doc"

RDEPENDS:${PN} += ""

inherit rpm
