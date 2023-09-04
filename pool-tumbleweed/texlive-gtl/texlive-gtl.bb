SUMMARY = "Manipulating generalized token lists"
DESCRIPTION = "The package provides tools for simple operations on lists of \
tokens which are not necessarily balanced. It is in particular \
used a lot in the unravel package, to go through tokens one at \
a time rather than having to work with entire braced groups at \
a time. The package requires up-to-date versions of the \
l3kernel, l3kpackages, and l3experimental bundles."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn49527"

RPM_NAME = "texlive-gtl-2023.209.0.0.5svn49527-54.2.noarch.rpm"
RPM_HASH = "6d246624ea3c495ddefbaeeffb39466bf5aa236ce7708c91e8d2ad72c822e3c83fdf20c8602c8dc9bd3db80f9ba17ca13eb068799ad7777e1908b77edd3b12b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtl.sty \
texlive-gtl"

RDEPENDS:${PN} += "/usr/bin/sh \
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
