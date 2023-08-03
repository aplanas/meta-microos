SUMMARY = "Create multi-column tables of mathematical functions"
DESCRIPTION = "The package defines a command to create possibly multi-column \
tables of mathematical function values. Key = value settings \
produce a wide variety of table styles consistent with the \
booktabs package (required). Also required are the packages \
numerica(v.2), l3kernel, l3packages, amsmath and mathtools."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn61288"

RPM_NAME = "texlive-numerica-tables-2023.209.2.0.0svn61288-55.1.noarch.rpm"
RPM_HASH = "2dd395ab8258c04efab264f740ad83dd9618898150a63417d53dbaff43e046d2c2aa3cda1b26bf066c3b16a33499626930ac96c921a670f196e653994c982be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numerica-tables.sty \
texlive-numerica-tables"

RDEPENDS:${PN} += "/usr/bin/sh \
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
