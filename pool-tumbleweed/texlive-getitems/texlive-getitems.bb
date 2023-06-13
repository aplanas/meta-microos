SUMMARY = "Gathering items from a list-like environment"
DESCRIPTION = "This package provides a \\gatheritems command to parse a list of \
data separated by \\item tokens. This makes it easier to define \
custom environments which structure their data in the same way \
that itemize or enumerate do."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39365"

RPM_NAME = "texlive-getitems-2023.201.1.0svn39365-52.1.noarch.rpm"
RPM_HASH = "f7a6192e3366aaa1c633c7aa2a86d450be5daa19448b0f6c6b22dd467b36201384314b9278c994882c671c36a43f90879119b4230411be1b8433afa136facfe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(getitems.sty) \
texlive-getitems"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(environ.sty) \
tex(trimspaces.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
