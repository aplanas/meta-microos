SUMMARY = "Deals with stripped SemanTeX documents"
DESCRIPTION = "This package is a small LaTeX package that adds a collection of \
simple macros for parentheses and bullets. It exists for one \
purpose only: To be loaded by documents which were originally \
typeset using the package SemanTeX, but which have been \
stripped of SemanTeX markup using the package stripsemantex \
which is part of SemanTeX. Therefore, unless your document is \
one of those, simply don't use this package. And even if your \
document is one of those, there is a good chance you will not \
have to load it after all. In most cases, you will be able to \
replace the macros it provides by macros from other packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.45svn56530"

RPM_NAME = "texlive-semtex-2023.209.0.0.45svn56530-54.1.noarch.rpm"
RPM_HASH = "dcde74bf6df8a577e95da9757ff1c95a424eb3f250049395289d1166ff975f5b8dc788952fcf841c0f32463d5dbe11584ac9722d7707629aa5f04dbbb82240cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semtex.sty \
texlive-semtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
