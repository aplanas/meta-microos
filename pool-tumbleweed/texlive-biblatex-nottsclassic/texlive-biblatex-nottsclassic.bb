SUMMARY = "Citation style for the University of Nottingham"
DESCRIPTION = "This citation-style covers the citation and bibliography rules \
of the University of Nottingham."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41596"

RPM_NAME = "texlive-biblatex-nottsclassic-2023.201.0.0.1svn41596-53.1.noarch.rpm"
RPM_HASH = "b84ac501f5567e615be3627d179fa8b42125cc372a96489080975d01a22985c4a4f9dd2ad9e458e936dfb4a6747367aa2dd13b55d98dc99889928bbabef4285b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nottsclassic-english.lbx) \
tex(nottsclassic.bbx) \
tex(nottsclassic.cbx) \
texlive-biblatex-nottsclassic"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(authoryear.bbx) \
tex(british.sty) \
tex(csquotes.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
