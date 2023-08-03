SUMMARY = "Harvard referencing style as recommended by the University of Bath Library"
DESCRIPTION = "This package provides a BibLaTeX style to format reference \
lists in the Harvard style recommended by the University of \
Bath Library."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn63401"

RPM_NAME = "texlive-biblatex-bath-2023.209.6.0svn63401-54.1.noarch.rpm"
RPM_HASH = "8942be916e5508544b63d398e8217427b3fc86d8129d0fe2adab21a382b004aafa0e58c3fb9e064c764ab21e6cd8c9cd33425226ee81648da656ae9d24f9e778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bath.bbx \
tex-bath.cbx \
tex-british-bath.lbx \
tex-english-bath.lbx \
texlive-biblatex-bath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.cbx \
tex-etoolbox.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
