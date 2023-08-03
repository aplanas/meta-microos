SUMMARY = "Create beautiful scientific Persian/Latin posters using TikZ"
DESCRIPTION = "This package is designed for making beautiful scientific \
Persian/Latin posters. It is a fork of baposter by Brian Amberg \
and Reinhold Kainhofer available at \
http://www.brian-amberg.de/uni/poster/. baposter's users should \
be able to compile their poster using xebaposter (instead of \
baposter) without any problem."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.53svn63513"

RPM_NAME = "texlive-xebaposter-2023.209.2.53svn63513-53.1.noarch.rpm"
RPM_HASH = "86da25d2e2d3f3429a2e71bcdfe60f81bdf32f6033c5036aca27aead5b17db4509ab8a52372064922a2e32337f8d77883ad9763af32674a9823419254c9f0c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xebaposter.cls \
texlive-xebaposter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-pgf.sty \
tex-pgfpages.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
