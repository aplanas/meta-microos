SUMMARY = "Natural mathematics notation"
DESCRIPTION = "Nath is a LaTeX (both 2e and 2.09) style to separate \
presentation and content in mathematical typography. The style \
delivers a particular context-dependent presentation on the \
basis of a rather coarse context-independent notation. \
Highlighted features: depending on the context, the command \
\\frac produces either built-up or case or solidus fractions, \
with parentheses added whenever required for preservation of \
the mathematical meaning; delimiters adapt their size to the \
material enclosed, rendering \\left and \\right almost obsolete."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-nath-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "3208b7d994961ea1db32b19b1847baaab2249b6e009f10682f8533211686f18395e3a9a7795f124e7b136d0df83a4dce826c3f18ebbf207dd80165de3ccf09b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nath.sty \
texlive-nath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
