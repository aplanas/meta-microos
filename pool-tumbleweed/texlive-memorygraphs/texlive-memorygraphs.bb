SUMMARY = "TikZ styles to typeset graphs of program memory"
DESCRIPTION = "This package defines some TikZ styles and adds anchors to \
existing styles that ease the declaration of 'memory graphs'. \
It is intended for graphs that represent the memory of a \
computer program during its execution."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn49631"

RPM_NAME = "texlive-memorygraphs-2023.201.0.0.1.1svn49631-52.1.noarch.rpm"
RPM_HASH = "b5de26fba5914b5acb09bad26a26f1ec4da5cf6257fcbdb5ac1493221f8ba930f996a1287177dfa20ba2721b553b311ec09ff645be889f771ed55a160bb9bff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(memorygraphs.sty) \
texlive-memorygraphs"
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
