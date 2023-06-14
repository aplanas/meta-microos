SUMMARY = "German input encodings in LaTeX"
DESCRIPTION = "An early package for using alternate input encodings. The \
author considers the package mostly obsolete, since most of its \
functions are taken by the inputenc package; however, inputenc \
doesn't support the roman8 and atari encodings, so umlaute \
remains the sole source of that support."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-umlaute-2023.201.2.1svn15878-53.1.noarch.rpm"
RPM_HASH = "f2114db5398cbe28ae12f2d5ae4254ee2f029ba35ae2abff6ae18c2ce3029b3c50a27fddab8705c93c8634a76b61ade7054316533aa600dbb281449b4c55d2e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atari.def \
tex-isolatin.def \
tex-mac.def \
tex-pc850.def \
tex-roman8.def \
tex-umlaute.sty \
texlive-umlaute"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-applemac.def \
tex-cp850.def \
tex-inputenc.sty \
tex-latin1.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
