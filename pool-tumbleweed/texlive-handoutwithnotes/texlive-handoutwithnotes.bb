SUMMARY = "Create Handouts with notes from your LaTeX beamer presentation"
DESCRIPTION = "This package provides pgfpages layouts to place notes next to \
the scaled slides."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62140"

RPM_NAME = "texlive-handoutwithnotes-2023.209.1.3svn62140-54.1.noarch.rpm"
RPM_HASH = "9fa52c2df8bff2c82fddbc477e4c4b2deebe51473e4f79310c28ff4f07663ebde33017fab1fd57f3896815d216e91155c51ce9e6142336746fb46435ed0545ce"
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
