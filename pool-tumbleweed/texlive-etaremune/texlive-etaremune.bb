SUMMARY = "Reverse-counting enumerate environment"
DESCRIPTION = "The package implements the etaremune environment which is an \
enumerate environment in which the labels decrease instead of \
increasing. The package is noticeably more efficient than the \
revnum package, which uses painfully many counters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-etaremune-2023.209.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "38a80079da61f4b90450179e0dead30f1a44721eaf3a569d8ce7186508b220dac3f1eb2df85d0315d71f3dbe5b8029ffcd1cd94328133ee939363801429cde9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etaremune.sty \
texlive-etaremune"

RDEPENDS:${PN} += "/usr/bin/sh \
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
