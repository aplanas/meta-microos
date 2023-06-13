SUMMARY = "Multiple versions of a bibliography, with different sort orders"
DESCRIPTION = "This package is a rewrite of the multibibliography package \
providing multiple bibliographies with different sorting. The \
new version offers a number of citation commands, streamlines \
the creation of bibliographies, ensures compatibility with the \
natbib package, and provides other improvements."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn37984"

RPM_NAME = "texlive-nmbib-2023.201.1.04svn37984-54.1.noarch.rpm"
RPM_HASH = "ec0e1068d09ac4a25c898d3127ec622abac2b05328eaee818d56d943a5e02a60b6e7d0c891df629441ba62b694276cc42d69e18f6840669b0cf8c027c1f4fd86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nmbib.sty) \
texlive-nmbib"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(natbib.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
