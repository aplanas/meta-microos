SUMMARY = "Classes for Societe mathematique de France publications"
DESCRIPTION = "The Societe mathematique de France provides a set of classes, \
packages and BibTeX styles that are used in its publications. \
They are based on AMS classes (whose code is sometimes \
recopied) and mainly 'upward-compatible'. Their main features \
are: quite different design; new environments for typesetting \
some information in two languages (altabstract, alttitle, \
altkeywords); if necessary, use of babel (option frenchb) and \
deactivation of some features of frenchb. Includes smfart.cls, \
smfbook.cls, smfplain.bst, smfalpha.bst, amongst others."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn58910"

RPM_NAME = "texlive-smflatex-2023.209.1.6svn58910-58.1.noarch.rpm"
RPM_HASH = "f0f467c8d604c67f07ba5b6168c39f3982b00baa3eb998e67c1eef6f77c8278b9b89e5bd7c844235e6b73955c61972261f71f2baa88e97b4153c4843cb15c962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-smfart.cls \
tex-smfbib.sty \
tex-smfbook.cls \
tex-smfbull.sty \
tex-smfenum.sty \
tex-smfgen.sty \
tex-smfhyperref.sty \
tex-smfmulti.sty \
tex-smfthm.sty \
texlive-smflatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ae.sty \
tex-amscd.sty \
tex-amsfonts.sty \
tex-amsgen.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-fontenc.sty \
tex-hyperref.sty \
tex-mltex.sty \
tex-multicol.sty \
tex-textcomp.sty \
tex-url.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
