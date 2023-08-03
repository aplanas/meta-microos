SUMMARY = "A simple citation style for Chinese users"
DESCRIPTION = "The package provides a simple and easily extensible \
biblography/citation style for Chinese LaTeX users, using \
BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.6svn64866"

RPM_NAME = "texlive-biblatex-caspervector-2023.209.0.0.3.6svn64866-54.1.noarch.rpm"
RPM_HASH = "2f6c8a31e1e2828f5b53fa0e0fe8b5ea097947a47bee201dc4108c5903499cc463a394323aef34e8b379a64c53786f7537a3f0d510fec354b0129eba389cd932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blx-caspervector-base.def \
tex-blx-caspervector-gbk.def \
tex-blx-caspervector-utf8.def \
tex-caspervector-ay.bbx \
tex-caspervector-ay.cbx \
tex-caspervector.bbx \
tex-caspervector.cbx \
texlive-biblatex-caspervector"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
