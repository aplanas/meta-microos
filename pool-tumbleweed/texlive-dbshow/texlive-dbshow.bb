SUMMARY = "A package to store and display data with custom filters, orders, and styles"
DESCRIPTION = "The package provides four core functions: data storage and \
display data filtering data sorting data display All data is \
saved once and then you can display these data with custom \
filters, orders and styles. The package can be used, for \
example, to record and display something you'd like to review, \
maybe the question you always answered incorrectly or some \
forgettable knowledge. But obviously, the package is much more \
powerful and extensible for more interesting tasks depending on \
the individual."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn61634"

RPM_NAME = "texlive-dbshow-2023.209.1.5svn61634-53.1.noarch.rpm"
RPM_HASH = "66c8f4401258c78f98555d598a3b3d61f35a54c18413a32291afb7a7ec6d83dbf8e42e494a8d78596fa34d7f79583a305f6ea5d2597c0e95fe6cd0edbae814f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dbshow.sty \
texlive-dbshow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
