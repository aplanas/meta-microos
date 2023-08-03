SUMMARY = "Implements pdfTeX's escape features using TeX or e-TeX"
DESCRIPTION = "This package implements pdfTeX's escape features \
(\\pdfescapehex, \\pdfunescapehex, \\pdfescapename, \
\\pdfescapestring) using TeX or e-TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn53082"

RPM_NAME = "texlive-pdfescape-2023.209.1.15svn53082-52.1.noarch.rpm"
RPM_HASH = "56e05516e89088827e0ae42d8900b189c0c82c74943aa50cc4b0b6b841d99eef5dfae9a4b68cc19e5bfd6b570bd7d51409a0cd1d7436bf31c790b2e0fe3934e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfescape.sty \
texlive-pdfescape"

RDEPENDS:${PN} += "/usr/bin/sh \
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
