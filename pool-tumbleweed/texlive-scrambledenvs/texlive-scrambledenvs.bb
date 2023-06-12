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

PV = "2023.201.1.1.0svn60615"

RPM_NAME = "texlive-scrambledenvs-2023.201.1.1.0svn60615-53.1.noarch.rpm"
RPM_HASH = "b7261b476864e5b364d9a9a54638e8c20bdbfc908a8ecf0606583da1ed3f48d9d45a35c2d5b09e232d4a8c5bbe24344b3e26b9a63a09e977727cac6a8a805669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(scrambledenvs.sty) \
texlive-scrambledenvs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(forloop.sty) \
tex(ifthen.sty) \
tex(pgfmath.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
