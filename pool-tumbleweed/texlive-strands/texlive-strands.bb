SUMMARY = "Draw objects constructed from strands"
DESCRIPTION = "This package permits to draw objects constructed from strands, \
like set partitions, permutations, braids, etc. It depends on \
forarray, ifthen, TikZ, xfp, xstring, and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn59906"

RPM_NAME = "texlive-strands-2023.201.1.1svn59906-57.1.noarch.rpm"
RPM_HASH = "95419ee9452f6623430d500dc2f8c6f8d97e51e2be6679d7e6609fb54d39fd6c89aaa117997b3c717f40fe393a8b98a8f1d055d32acfb0826df573235bfa5572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(strands.sty) \
texlive-strands"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(forarray.sty) \
tex(ifthen.sty) \
tex(tikz.sty) \
tex(xfp.sty) \
tex(xkeyval.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
