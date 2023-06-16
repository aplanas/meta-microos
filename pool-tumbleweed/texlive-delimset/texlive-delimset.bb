SUMMARY = "Typeset and declare sets of delimiters with convenient size control"
DESCRIPTION = "delimset is a LaTeX2e package to typeset and declare sets of \
delimiters in math mode whose size can be adjusted \
conveniently."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49544"

RPM_NAME = "texlive-delimset-2023.201.1.1svn49544-52.1.noarch.rpm"
RPM_HASH = "1fb38263c00dcab07b664b3d0c9f821fb39737ded7b2150e2cd58bb9fb144bc072fdfa1c41d5738dce5581dfbe9430059b1965001657278ce4ad17713f06f81a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delimset.sty \
texlive-delimset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
