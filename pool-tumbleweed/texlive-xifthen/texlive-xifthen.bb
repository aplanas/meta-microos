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

RPM_NAME = "texlive-xifthen-2023.201.1.4.0svn38929-52.2.noarch.rpm"
RPM_HASH = "6c60189427697716e48eb0a4a272bdb4ef11bc1a24695669ec4adbfa7c9b152cb8e75b2bfbd7f5155708b96c7c871b81595b80e23430e8174bb59d81a564a56b"
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
