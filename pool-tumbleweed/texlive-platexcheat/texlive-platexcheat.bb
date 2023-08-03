SUMMARY = "A LaTeX cheat sheet, in Japanese"
DESCRIPTION = "This is a translation to Japanese of Winston Chang's LaTeX \
cheat sheet (a reference sheet for writing scientific papers). \
It has been adapted to Japanese standards using pLaTeX, and \
also attached additional information of 'standard LaTeX' \
(especially about math-mode)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn49557"

RPM_NAME = "texlive-platexcheat-2023.209.3.1svn49557-53.1.noarch.rpm"
RPM_HASH = "86650969aae384f9ffb8aaf33a37769654340422084d405bf55c487be774c466d64fa52011704d3a57c38da132ffe29db93bf014bef24dc0821549a73de00fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-platexcheat"

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
