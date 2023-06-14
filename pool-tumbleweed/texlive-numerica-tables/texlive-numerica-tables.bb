SUMMARY = "Create multi-column tables of mathematical functions"
DESCRIPTION = "The package defines a command to create possibly multi-column \
tables of mathematical function values. Key = value settings \
produce a wide variety of table styles consistent with the \
booktabs package (required). Also required are the packages \
numerica(v.2), l3kernel, l3packages, amsmath and mathtools."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn61288"

RPM_NAME = "texlive-numerica-tables-2023.201.2.0.0svn61288-54.1.noarch.rpm"
RPM_HASH = "bee5f6f0b293cf623dc96f9d258114a74a7c24d226af282944b704b21138552b2fb883e1b73ca5c84be02a22c756fdc09a60d569ddf854633a279fb0844f531b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numerica-tables.sty \
texlive-numerica-tables"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-numerica.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
