SUMMARY = "Create beautiful scientific Persian/Latin posters using TikZ"
DESCRIPTION = "This package is designed for making beautiful scientific \
Persian/Latin posters. It is a fork of baposter by Brian Amberg \
and Reinhold Kainhofer available at \
http://www.brian-amberg.de/uni/poster/. baposter's users should \
be able to compile their poster using xebaposter (instead of \
baposter) without any problem."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.53svn63513"

RPM_NAME = "texlive-xebaposter-2023.201.2.53svn63513-52.2.noarch.rpm"
RPM_HASH = "d493030653ba0e3550dae6d79a101102a4733dd1d6b6f040309f17ad2fa7f9052cc798f10f95e51353b8f90f3b7e45d6942c3dc86ee61b145d690b14b41188ae"
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
