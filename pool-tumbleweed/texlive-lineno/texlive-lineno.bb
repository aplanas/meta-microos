SUMMARY = "Line numbers on paragraphs"
DESCRIPTION = "Adds line numbers to selected paragraphs with reference \
possible through the LaTeX \\ref and \\pageref cross reference \
mechanism. Line numbering may be extended to footnote lines, \
using the fnlineno package."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.1svn65586"

RPM_NAME = "texlive-lineno-2023.209.5.1svn65586-55.1.noarch.rpm"
RPM_HASH = "a3ee4bd270467bef2b409ef24346d0f08ba117d62c78dd454f7bc5070183683460b3d6788c1cb644740376e5d9eec8f7f3b6bc13a3c82550c07d30d2976d92ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ednmath0.sty \
tex-edtable.sty \
tex-fnlineno.sty \
tex-lineno.sty \
tex-vplref.sty \
texlive-lineno"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-finstrut.sty \
tex-longtable.sty \
tex-ltabptch.sty \
tex-varioref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
