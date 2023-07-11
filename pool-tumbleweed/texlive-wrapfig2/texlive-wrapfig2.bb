SUMMARY = "Wrap text around figures"
DESCRIPTION = "This package is a fork of Donald Arseneau's wrapfig package. It \
is backwards compatible with the original environments. \
Therefore this package does not work with LaTeX2e kernels older \
than about 2018, although a warning is issued if the LaTeX \
format file is dated with a date older than 1st January 2019."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1.1svn66115"

RPM_NAME = "texlive-wrapfig2-2023.201.6.1.1svn66115-52.2.noarch.rpm"
RPM_HASH = "6159e0464c2264f74be713dbd053241b8740d36b17894341ae2d92b20c00ced422015640e3a9a8ee2470ef925a062fa824235b90a29f35656eb7853138449c55"
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
