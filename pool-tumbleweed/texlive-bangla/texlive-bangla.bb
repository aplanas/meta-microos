SUMMARY = "A comprehensive Bangla LaTeX package"
DESCRIPTION = "This package provides all the necessary LaTeX frontends for the \
Bangla language and comes with some fonts of its own."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn65786"

RPM_NAME = "texlive-bangla-2023.209.2.1svn65786-54.1.noarch.rpm"
RPM_HASH = "8c2f7c97040b001f1e02b275f160f1a3c5924f2a39c4b0992807e7745d5076dd37fee13cde6e3d70094a05ea80d8be67819bf8d0a964b1151409ac287a983b56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bangla.sty \
tex-banglamap.tex \
texlive-bangla"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CharisSIL.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-polyglossia.sty \
texlive \
texlive-bangla-fonts \
texlive-charissil \
texlive-doulossil \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
