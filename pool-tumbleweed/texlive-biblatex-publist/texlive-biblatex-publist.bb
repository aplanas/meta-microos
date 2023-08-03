SUMMARY = "BibLaTeX bibliography support for publication lists"
DESCRIPTION = "The package provides a BibLaTeX bibliography style file (*.bbx) \
for publication lists. The style file draws on BibLaTeX's \
authoryear style, but provides some extra features often \
desired for publication lists, such as the omission of the \
author's own name from author or editor data. At least version \
3.4 of biblatex is required."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn66273"

RPM_NAME = "texlive-biblatex-publist-2023.209.2.2svn66273-54.1.noarch.rpm"
RPM_HASH = "cddd404faa09efc8fcfcdf324ef61170e924d4521e25da22076fce2c0e3dd40dea991347055dbe8d1c0218a1aad14283ac41796e79413d9be0dc342901c98ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-publist.bbx \
tex-publist.cbx \
texlive-biblatex-publist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
