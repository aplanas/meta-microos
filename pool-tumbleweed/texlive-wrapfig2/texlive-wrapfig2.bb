SUMMARY = "Wrap text around figures"
DESCRIPTION = "This package is a fork of Donald Arseneau's wrapfig package. It \
is backwards compatible with the original environments. \
Therefore this package does not work with LaTeX2e kernels older \
than about 2018, although a warning is issued if the LaTeX \
format file is dated with a date older than 1st January 2019."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1.1svn66115"

RPM_NAME = "texlive-wrapfig2-2023.209.6.1.1svn66115-53.2.noarch.rpm"
RPM_HASH = "a9339faf46507f289e6efc2935aa3d6b44ad4f6e8d7a856b8b3cf98bc8fc73790e20167baa43df78672a62ba5375f33bf579544c925f00953fd3d2b434570ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wrapfig2.sty \
texlive-wrapfig2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-curve2e.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
