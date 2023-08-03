SUMMARY = "Easy creation of worksheets"
DESCRIPTION = "This package provides macros and an environment for easy \
worksheet creation: Use the exercise environment for formating \
exercises in a simple, efficient design; typeset customized and \
automatically numbered worksheet titles in the same way as \
standard LaTeX titles (using \\maketitle); provide course and \
author information with a scrlayer-scrpage based automated \
header; conforming to different babel languages. (Currently \
English, French, and German are supported.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48423"

RPM_NAME = "texlive-worksheet-2023.209.1.1svn48423-54.1.noarch.rpm"
RPM_HASH = "3e86152c48067adfc7be039d34e1fe3f0900fc6084bdfca218855e4045078b9c9466f0acd9ac58c85822afadff60402f945c0d039d5e914aa9431bf0b8ea76d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-worksheet.sty \
texlive-worksheet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-scrlayer-scrpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
