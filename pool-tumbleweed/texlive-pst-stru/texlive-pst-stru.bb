SUMMARY = "Civil engineering diagrams, using PSTricks"
DESCRIPTION = "This PSTricks-based package provides facilities to draw \
structural schemes in civil engineering analysis, for beams, \
portals, arches and piles."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-2023.201.0.0.13svn38613-53.2.noarch.rpm"
RPM_HASH = "b65fd2c222d95eb8e97c6a3948143cc981cc878f43793669d4a018130a7f27e6590809793a4bd748bb821132eae9e0d1103e3776a89988130a07d4b7f279de79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-stru.sty \
tex-pst-stru.tex \
texlive-pst-stru"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
