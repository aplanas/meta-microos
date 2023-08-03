SUMMARY = "Add reference-page-list to bibliography-items"
DESCRIPTION = "The package does its job without using the indexing facilities, \
and needs no special \\cite-replacement package."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.1svn47407"

RPM_NAME = "texlive-citeref-2023.209.1.1svn47407-54.1.noarch.rpm"
RPM_HASH = "a286f07dd5c580125d673e2a06216efd5a1f883282c32d1442c44d3a0d069d3d5f8aee6ca28522ebc65474e6fd7ae118f0bb3f16cea21b0ffd058110f7b0267e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-citeref.sty \
texlive-citeref"

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
