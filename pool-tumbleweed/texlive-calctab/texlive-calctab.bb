SUMMARY = "Language for numeric tables"
DESCRIPTION = "The calctab package helps the user to typeset a kind of \
economic table such as invoices, expense notes and liquidation, \
or other tabular material with a values column. The code \
computes sum and percentage with floating point numeric methods \
(using the fltpoint package) and builds the render table task."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6.1svn15878"

RPM_NAME = "texlive-calctab-2023.201.0.0.6.1svn15878-52.1.noarch.rpm"
RPM_HASH = "e3e702a89b49ecfc3c5d103a9ad2f8923f3320eccccb609ba4efaf06484005dedacd0e5993ea7d28dde6637d1803398cbc8b3aefc055198d6cc206fd4fffd902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(calctab.sty) \
texlive-calctab"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alphalph.sty) \
tex(booktabs.sty) \
tex(eurosym.sty) \
tex(fltpoint.sty) \
tex(ifthen.sty) \
tex(numprint.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
