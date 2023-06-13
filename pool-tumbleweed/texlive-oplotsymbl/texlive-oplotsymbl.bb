SUMMARY = "Some symbols which are not easily available"
DESCRIPTION = "This package is named oPlotSymbl and it includes symbols, which \
are not easily available. Especially, these symbols are used in \
scientific plots, but the potential user is allowed to use them \
in other ways. This package uses TikZ and xcolor."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn44951"

RPM_NAME = "texlive-oplotsymbl-2023.201.1.4svn44951-54.1.noarch.rpm"
RPM_HASH = "3943bb007102c2e35150b0e4f1b845dabf76867b8f1e0342f03d6b150bd91ae0e6734a3694ca97adff544379750c853d8434cab6ac06ac98d1f54b2892c13092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(oplotsymbl.sty) \
texlive-oplotsymbl"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
