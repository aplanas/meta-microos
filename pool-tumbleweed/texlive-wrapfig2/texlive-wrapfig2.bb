SUMMARY = "Wrap text around figures"
DESCRIPTION = "This package is a fork of Donald Arseneau's wrapfig package. It \
is backwards compatible with the original environments. \
Therefore this package does not work with LaTeX2e kernels older \
than about 2018, although a warning is issued if the LaTeX \
format file is dated with a date older than 1st January 2019."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1.1svn66115"

RPM_NAME = "texlive-wrapfig2-2023.201.6.1.1svn66115-52.1.noarch.rpm"
RPM_HASH = "00a0eb27725ae837a3c7fdbbee33f0dc1afddeae9be5b2649b50a99e2dfc7b72563f0d08bd2976fca32f9e8f68c83e4aed902af742229d883e7ebe03a7116c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wrapfig2.sty) \
texlive-wrapfig2"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(curve2e.sty) \
tex(etoolbox.sty) \
tex(float.sty) \
tex(xcolor.sty) \
tex(xfp.sty) \
tex(xkeyval.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
