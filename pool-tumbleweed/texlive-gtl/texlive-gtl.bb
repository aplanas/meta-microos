SUMMARY = "Manipulating generalized token lists"
DESCRIPTION = "The package provides tools for simple operations on lists of \
tokens which are not necessarily balanced. It is in particular \
used a lot in the unravel package, to go through tokens one at \
a time rather than having to work with entire braced groups at \
a time. The package requires up-to-date versions of the \
l3kernel, l3kpackages, and l3experimental bundles."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn49527"

RPM_NAME = "texlive-gtl-2023.201.0.0.5svn49527-53.1.noarch.rpm"
RPM_HASH = "92996c766fcce5f93e9578e316b61b57c7d4ab7cbcbb694636a2402e0a5809d6cdd5b7eef69fecfd03f0120ef24dbbf019c8940632aca53b6e01687786352108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtl.sty \
texlive-gtl"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3-generic.tex \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
