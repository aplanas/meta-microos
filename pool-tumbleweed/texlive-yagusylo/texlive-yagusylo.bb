SUMMARY = "A symbol loader"
DESCRIPTION = "The name is by way of being an acronym for 'Yet Another Grand \
Unified Symbols Loader'... The package allows the user to \
access a symbol without loading the package that usually \
provides it; this has the advantage of avoiding the name \
clashes that so commonly trouble those who load \
symbol-packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn29803"

RPM_NAME = "texlive-yagusylo-2023.201.1.2svn29803-52.2.noarch.rpm"
RPM_HASH = "0fa5dfe74c6a617edc3a3ce30c6922ddad3357c9f777f48ad0e2555791bc9502843724bf12853ca98bf770c9345fcf873d840dc1043b4eddabcd0ce4fb955928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yagusylo.cfg \
tex-yagusylo.sty \
texlive-yagusylo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-suffix.sty \
tex-xargs.sty \
tex-xcolor.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
