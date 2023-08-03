SUMMARY = "Correct spacing of the alignment in expressions"
DESCRIPTION = "This package realigns the horizontal spacing of the alignments \
in some mathematical environments."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.1svn44131"

RPM_NAME = "texlive-correctmathalign-2023.209.1.1svn44131-55.1.noarch.rpm"
RPM_HASH = "1c2c6e80230f086518b1f05d53c45ebf53269f36c5f312df173dff0bafdc4b7c72798d0f27751b6e8010de4994493150a0be3c44d086cf187263994520d0e2c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-correctmathalign.sty \
texlive-correctmathalign"

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
