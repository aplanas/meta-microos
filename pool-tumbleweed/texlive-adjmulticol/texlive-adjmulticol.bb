SUMMARY = "Adjusting margins for multicolumn and single column output"
DESCRIPTION = "The package adds, to the multicol package, the option to change \
the margins for multicolumn and unicolumn layout. The package \
understands the difference between the even and odd margins for \
two side printing."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn63320"

RPM_NAME = "texlive-adjmulticol-2023.201.1.5svn63320-54.1.noarch.rpm"
RPM_HASH = "ec1cac3fedb21ad92588fcbfa54ae465ac041d5764b2a8ad1935e4c0390c943b877493b079d6040050e7df90a43faa7b521a7852b3d9b02b69fa182cdb29c4c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adjmulticol.sty \
texlive-adjmulticol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
