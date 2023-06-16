SUMMARY = "John Cleese's Silly Walk as page numbering style"
DESCRIPTION = "This simple LaTeX package provides John Cleese's iconic silly \
walk routine as a page numbering style. Other counters, as well \
as integers, can be typeset in this 'silly' style, too."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn66349"

RPM_NAME = "texlive-sillypage-2023.201.1.6svn66349-53.1.noarch.rpm"
RPM_HASH = "e4dbd406ac06ce72a66ae9fb023c943dddbb5a3d3756b3c155a4e10f33edb826931b9b4bc49098d674e3a8087458ec3a4c6fba64d1aeb9b0bc28dba60d4dab7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sillypage.sty \
texlive-sillypage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
