SUMMARY = "Create beautiful scientific Persian/Latin posters using TikZ"
DESCRIPTION = "This package is designed for making beautiful scientific \
Persian/Latin posters. It is a fork of baposter by Brian Amberg \
and Reinhold Kainhofer available at \
http://www.brian-amberg.de/uni/poster/. baposter's users should \
be able to compile their poster using xebaposter (instead of \
baposter) without any problem."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.53svn63513"

RPM_NAME = "texlive-xebaposter-2023.209.2.53svn63513-53.2.noarch.rpm"
RPM_HASH = "82478d1b6a1e4d8ecb2854a61d29e9b09c41f06d756d96fb7423cdc05cbe62f2024c3d2bf4e7b92cd6564b1a0c569d98d1cfed1b05f6a3df2f6318b6c3956a08"
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
