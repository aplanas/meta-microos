SUMMARY = "Extended conditional commands"
DESCRIPTION = "This package extends the ifthen package by implementing new \
commands to go within the first argument of \\ifthenelse: to \
test whether a string is void or not, if a command is defined \
or equivalent to another. The package also enables use of \
complex expressions as introduced by the package calc, together \
with the ability of defining new commands to handle complex \
tests."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn38929"

RPM_NAME = "texlive-xifthen-2023.209.1.4.0svn38929-53.2.noarch.rpm"
RPM_HASH = "60a1a1a1114c7b98fc0b2577622d8eceb5cd61d7006a7279ebb34d4acd36f43f089e170d49a1a0180b9cd3072501f31ad246e49fa71632ad0ff84246a06478d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xifthen.sty \
texlive-xifthen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifmtarg.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
