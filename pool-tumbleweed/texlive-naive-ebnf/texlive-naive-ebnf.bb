SUMMARY = "EBNF in Plain Text"
DESCRIPTION = "With the help of this LaTeX package a context-free grammar \
(CFG) may be rendered in a plain-text mode using a simplified \
Extended Backus-Naur Form (EBNF) notation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.5svn66017"

RPM_NAME = "texlive-naive-ebnf-2023.209.0.0.0.5svn66017-55.1.noarch.rpm"
RPM_HASH = "9eb03caff57839c73a94077f47e7d7e09fc9ea98edfb50f58009419e1dec36dc279bb76d6c95a5ecf8fb94b142c98757c5099bf0c36b546758215e7511d29d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-naive-ebnf.sty \
texlive-naive-ebnf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgfopts.sty \
tex-xcolor.sty \
texlive \
texlive-filecontentsdef \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
