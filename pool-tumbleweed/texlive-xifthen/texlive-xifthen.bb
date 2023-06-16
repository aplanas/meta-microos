SUMMARY = "Extended conditional commands"
DESCRIPTION = "This package extends the ifthen package by implementing new \
commands to go within the first argument of \\ifthenelse: to \
test whether a string is void or not, if a command is defined \
or equivalent to another. The package also enables use of \
complex expressions as introduced by the package calc, together \
with the ability of defining new commands to handle complex \
tests."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn38929"

RPM_NAME = "texlive-xifthen-2023.201.1.4.0svn38929-52.1.noarch.rpm"
RPM_HASH = "f28750b981ba9e286b7726770efead070560f50f3a997b0b824c51b2b2a6758b64e6f77fd76028966a050bb93db738cbc7d573af7d316498095af6f55f8f27ad"
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
