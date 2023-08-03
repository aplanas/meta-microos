SUMMARY = "Typeset working papers of the Czech National Bank"
DESCRIPTION = "The package supports proper formatting of Working Papers of the \
Czech National Bank (WP CNB). The package was developed for CNB \
but it is also intended for authors from outside CNB."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32550"

RPM_NAME = "texlive-cnbwp-2023.209.svn32550-54.1.noarch.rpm"
RPM_HASH = "6260c8460012506765b3e72591b947b503ab0c6f3f121dba40323bb65087fa4133dd9dd4830b29a0253a934e168886a30bccdd240ce1a20cb9577a4ded32a31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cnbwp-manual.sty \
tex-cnbwp.cls \
tex-cnbwpsizes.clo \
texlive-cnbwp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-color.sty \
tex-dcolumn.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-makeidx.sty \
tex-mathptmx.sty \
tex-moreverb.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-polyglossia.sty \
tex-rotating.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xevlna.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
