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

PV = "2023.201.1.6svn58910"

RPM_NAME = "texlive-smflatex-2023.201.1.6svn58910-57.1.noarch.rpm"
RPM_HASH = "c4bfb3b2234f4e4347ae2b63e7c491bc13b84e7bdcbbeeba81e92690d231d2631daa17feb433a9e0ae39482d306dd1c9b9db7f2d2275edf3d9f7619b11ffd144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(smfart.cls) \
tex(smfbib.sty) \
tex(smfbook.cls) \
tex(smfbull.sty) \
tex(smfenum.sty) \
tex(smfgen.sty) \
tex(smfhyperref.sty) \
tex(smfmulti.sty) \
tex(smfthm.sty) \
texlive-smflatex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ae.sty) \
tex(amscd.sty) \
tex(amsfonts.sty) \
tex(amsgen.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(babel.sty) \
tex(fontenc.sty) \
tex(hyperref.sty) \
tex(mltex.sty) \
tex(multicol.sty) \
tex(textcomp.sty) \
tex(url.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
