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

RPM_NAME = "texlive-xifthen-2023.209.1.4.0svn38929-53.1.noarch.rpm"
RPM_HASH = "12e2d2d979edd84f31ce3a400d4152ad1787189191c7e7712c3b2e462d2601e742c0b2d8c4a26d41e49fe1ec31b100cd958cd2e895c5a6867a2300efb2fbdbd5"
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
