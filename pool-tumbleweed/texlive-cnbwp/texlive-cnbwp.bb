SUMMARY = "Typeset working papers of the Czech National Bank"
DESCRIPTION = "The package supports proper formatting of Working Papers of the \
Czech National Bank (WP CNB). The package was developed for CNB \
but it is also intended for authors from outside CNB."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32550"

RPM_NAME = "texlive-cnbwp-2023.201.svn32550-53.1.noarch.rpm"
RPM_HASH = "c63ca21ac69537fee8f097ffd0bd46c9852e341463b006da405e62067b0079868b553ae2d86465b78e578a9b5149ae6832648c47145200cafd58f0b71de2bdfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cnbwp-manual.sty \
tex-cnbwp.cls \
tex-cnbwpsizes.clo \
texlive-cnbwp"

RDEPENDS:${PN} += "/bin/sh \
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
