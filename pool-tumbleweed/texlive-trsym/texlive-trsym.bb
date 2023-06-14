SUMMARY = "Symbols for transformations"
DESCRIPTION = "The bundle provides Metafont source for a small font used for \
(e.g.) Laplace transformations, together with a LaTeX .fd file \
and a package providing commands for the symbols' use in \
mathematics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn18732"

RPM_NAME = "texlive-trsym-2023.201.1.0svn18732-52.1.noarch.rpm"
RPM_HASH = "95d1c57598381c3897b09ee73259d7ccc3a4e0f56c53d038db3386fa00d25c635c6939f1010050e90db063714db713439e33d41163ac4584c3fd5880e494cf6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trsy10.tfm \
tex-trsy12.tfm \
tex-trsym.sty \
tex-utrsy.fd \
texlive-trsym"

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
