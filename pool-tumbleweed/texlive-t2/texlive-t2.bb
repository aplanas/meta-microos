SUMMARY = "Support for using T2 encoding"
DESCRIPTION = "The T2 bundle provides a variety of separate support functions \
for using Cyrillic characters in LaTeX: the mathtext package, \
for using Cyrillic letters 'transparently' in formulae; the \
citehack package, for using Cyrillic (or indeed any non-ascii) \
characters in citation keys; support for Cyrillic in BibTeX; \
support for Cyrillic in Makeindex; and various items of font \
support."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn47870"

RPM_NAME = "texlive-t2-2023.201.svn47870-57.1.noarch.rpm"
RPM_HASH = "724f13b13f66674859c0c1a6ea57eed2cacf52695c97e4816f755969163eeeea230f65fcd0bc9f0426e796408906330bd9b7c98678108fe4d7be8f32840a08e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(alias-cmc.tex) \
tex(alias-wncy.tex) \
tex(citehack.sty) \
tex(cyralias.tex) \
tex(fnstcorr.tex) \
tex(mathtext.sty) \
tex(misccorr.sty) \
tex(t2a-mod1.enc) \
tex(t2a-mod2.enc) \
tex(t2a.enc) \
tex(t2b.enc) \
tex(t2c.enc) \
tex(x2.enc) \
texlive-t2"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(enumerate.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
