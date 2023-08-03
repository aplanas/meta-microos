SUMMARY = "'Traditional' BibTeX styles with BibLaTeX"
DESCRIPTION = "The bundle provides implementations of the 'traditional' BibTeX \
styles (plain, abbrev, unsrt and alpha) with BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn58169"

RPM_NAME = "texlive-biblatex-trad-2023.209.0.0.5svn58169-54.1.noarch.rpm"
RPM_HASH = "13aa3c6663c2dccac6b847e196f712e73c07086b80db3634c0772932abd3ae75b3bb58a3b56fe308fa0f22549e78c1d2710d0793fe52041a0ff9a2b3aa324e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trad-abbrv.bbx \
tex-trad-abbrv.cbx \
tex-trad-alpha.bbx \
tex-trad-alpha.cbx \
tex-trad-plain.bbx \
tex-trad-plain.cbx \
tex-trad-standard.bbx \
tex-trad-standard.cbx \
tex-trad-unsrt.bbx \
tex-trad-unsrt.cbx \
texlive-biblatex-trad"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.cbx \
tex-numeric.cbx \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
