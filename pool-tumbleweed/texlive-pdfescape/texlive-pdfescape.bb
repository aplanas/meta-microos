SUMMARY = "Implements pdfTeX's escape features using TeX or e-TeX"
DESCRIPTION = "This package implements pdfTeX's escape features \
(\\pdfescapehex, \\pdfunescapehex, \\pdfescapename, \
\\pdfescapestring) using TeX or e-TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn53082"

RPM_NAME = "texlive-pdfescape-2023.201.1.15svn53082-51.1.noarch.rpm"
RPM_HASH = "c2137846ba4a1aa385da6a80a508778c8e20d6586ac947b8d77790aa97bcfc9daea387a24482c14a894176c8a52bc94d28d48eda51ec66d115decbd49f88ebe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfescape.sty \
texlive-pdfescape"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxcmds.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
