SUMMARY = "Babel support for documents written in Greek"
DESCRIPTION = "The file provides modes for monotonic (single-diacritic) and \
polytonic (multiple-diacritic) modes of writing. Provision is \
made for Greek function names in mathematics, and for \
classical-era symbols."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn66346"

RPM_NAME = "texlive-babel-greek-2023.201.1.12svn66346-53.1.noarch.rpm"
RPM_HASH = "dfffbbdf1d5ba751592cc48a8d9351dd9635d9353efc75a69f37c4ad7852cfe0d52f602ae7bf96d5011dcc7fdb620537c5793e0cdd75a8d3d4a6ef63227368b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-athnum.sty \
tex-greek.ldf \
tex-grmath.sty \
texlive-babel-greek"

RDEPENDS:${PN} += "/bin/sh \
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
