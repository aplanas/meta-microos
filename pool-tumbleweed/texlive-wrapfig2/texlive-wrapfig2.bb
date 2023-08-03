SUMMARY = "Wrap text around figures"
DESCRIPTION = "This package is a fork of Donald Arseneau's wrapfig package. It \
is backwards compatible with the original environments. \
Therefore this package does not work with LaTeX2e kernels older \
than about 2018, although a warning is issued if the LaTeX \
format file is dated with a date older than 1st January 2019."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1.1svn66115"

RPM_NAME = "texlive-wrapfig2-2023.209.6.1.1svn66115-53.1.noarch.rpm"
RPM_HASH = "56cda65b677f90beb9e29ca9474e7c255920dfd6c16ba876415bc3e3556958d229fbcafb27b02469dd86d67d2f066d79f9a8b43f34e37a78dd536163145b5dd5"
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
