SUMMARY = "Line numbers on paragraphs"
DESCRIPTION = "Adds line numbers to selected paragraphs with reference \
possible through the LaTeX \\ref and \\pageref cross reference \
mechanism. Line numbering may be extended to footnote lines, \
using the fnlineno package."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.1svn65586"

RPM_NAME = "texlive-lineno-2023.201.5.1svn65586-54.1.noarch.rpm"
RPM_HASH = "8f88d54c269e60d507fd3c6c318eb011c3e49b4b0fb62bfdbb92ca84fd9f54aeca1f9b366d292ca6daffa6137bf982f1f4c21315cb498fca51c68433ae3ebddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ednmath0.sty) \
tex(edtable.sty) \
tex(fnlineno.sty) \
tex(lineno.sty) \
tex(vplref.sty) \
texlive-lineno"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(finstrut.sty) \
tex(longtable.sty) \
tex(ltabptch.sty) \
tex(varioref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
