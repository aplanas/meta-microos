SUMMARY = "Create Handouts with notes from your LaTeX beamer presentation"
DESCRIPTION = "This package provides pgfpages layouts to place notes next to \
the scaled slides."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62140"

RPM_NAME = "texlive-handoutwithnotes-2023.209.1.3svn62140-54.2.noarch.rpm"
RPM_HASH = "0da86d33577a3734161df767faf991a7a2adef7184eb6d95d9abe8dd5ebec92b1c32416767dc8aa8e14b7533d2ca448678ae81f9615decde258ffd3b9c1bd8e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-handoutWithNotes.sty \
texlive-handoutwithnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-pgfpages.sty \
tex-translator.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
