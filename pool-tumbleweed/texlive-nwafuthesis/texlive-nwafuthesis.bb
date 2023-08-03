SUMMARY = "A thesis template package for Northwest A&F University, China"
DESCRIPTION = "This template supports doctoral and master dissertations and \
undergraduate theses in Chinese. With the help of modern LaTeX3 \
technology, nwafuthesis aims to create a simple interface, a \
normative format, as well as a hackable class for the users. At \
present, nwafuthesis only supports XeTeX and LuaTeX engines. \
nwafuthesis only allows UTF-8 encoding. nwafuthesis is based on \
the fduthesis template."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn63438"

RPM_NAME = "texlive-nwafuthesis-2023.209.1.15svn63438-55.1.noarch.rpm"
RPM_HASH = "2963d02171c99460f61090c6851f146f0c82912978799a96a44e9d78578c5f2e96b39d95a70e38f07b1cacb804095fa108ce5821b3b90c4a98ab80d23d4ef955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nwafuthesis.cls \
texlive-nwafuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-expl3.sty \
tex-hyperref.sty \
tex-l3keys2e.sty \
tex-pifont.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
