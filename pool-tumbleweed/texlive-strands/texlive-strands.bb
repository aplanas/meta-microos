SUMMARY = "Draw objects constructed from strands"
DESCRIPTION = "This package permits to draw objects constructed from strands, \
like set partitions, permutations, braids, etc. It depends on \
forarray, ifthen, TikZ, xfp, xstring, and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn59906"

RPM_NAME = "texlive-strands-2023.209.1.1svn59906-58.1.noarch.rpm"
RPM_HASH = "b4c847519068ea0b704e1a7ecfd449d3ffdf486358b5faac67720fa69c09e20c3388350f0a9c40fe8aef6dd2824cc1909eac49a05adc398461f8afb1e3b72505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-strands.sty \
texlive-strands"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-forarray.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xfp.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
