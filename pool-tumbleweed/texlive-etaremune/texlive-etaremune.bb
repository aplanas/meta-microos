SUMMARY = "Reverse-counting enumerate environment"
DESCRIPTION = "The package implements the etaremune environment which is an \
enumerate environment in which the labels decrease instead of \
increasing. The package is noticeably more efficient than the \
revnum package, which uses painfully many counters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-etaremune-2023.201.1.2svn15878-52.1.noarch.rpm"
RPM_HASH = "525d1b291f5eae6ea962dc8e531edf236839266a109df9bde4785a8921c34cb38718f91c9cff34dfb7ba05e46b10a4b1bed40f93c69732822a8b5135aed36de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etaremune.sty \
texlive-etaremune"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
