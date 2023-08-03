SUMMARY = "Language for numeric tables"
DESCRIPTION = "The calctab package helps the user to typeset a kind of \
economic table such as invoices, expense notes and liquidation, \
or other tabular material with a values column. The code \
computes sum and percentage with floating point numeric methods \
(using the fltpoint package) and builds the render table task."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6.1svn15878"

RPM_NAME = "texlive-calctab-2023.209.0.0.6.1svn15878-53.1.noarch.rpm"
RPM_HASH = "24304265c520794e22d51de4347317617e4dbadeee14cafa9b37b2d2b259bfcead438f1a6c2ab52f7dd4566c464bc41a075f2c18c63efa64ffed7e721c6e8ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calctab.sty \
texlive-calctab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-booktabs.sty \
tex-eurosym.sty \
tex-fltpoint.sty \
tex-ifthen.sty \
tex-numprint.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
