SUMMARY = "Create and print scrambled environments"
DESCRIPTION = "This package allows you to create and print scrambled \
environments for purposes such as randomized hint environments. \
You can mark a location with a series of hints, and then print \
the hints at the end in a pseudo-random order. The general \
structure follows: there is an outer environment which creates \
the label, an inner environment that creates the references, \
and a print command that prints out all of the hints. This \
generalizes beyond hints; one can create scrambled solutions as \
well, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn60615"

RPM_NAME = "texlive-scrambledenvs-2023.209.1.1.0svn60615-54.1.noarch.rpm"
RPM_HASH = "e92c28a5912ca574a9c4c7402d29d0a197aa2022edb9f9cb7b887ac073eeadce217ddb5fa461d537a6c6016540a766113c1e9a6ec320b097300dad24223d159d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrambledenvs.sty \
texlive-scrambledenvs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-forloop.sty \
tex-ifthen.sty \
tex-pgfmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
