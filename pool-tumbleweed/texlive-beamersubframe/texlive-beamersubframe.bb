SUMMARY = "Reorder frames in the PDF file"
DESCRIPTION = "The package provides a method to reorder frames in the PDF file \
without reordering the source. Its principal use is to embed or \
append frames with details on some subject. The author \
describes the package as 'experimental'."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn23510"

RPM_NAME = "texlive-beamersubframe-2023.209.0.0.2svn23510-54.1.noarch.rpm"
RPM_HASH = "ae314775b04d52a44bce1d4ef1eced9ccb89dfc9d24588f34de5d21ad05f4c31d240e03a5256b0ffa9f08d6bae621a1e16230d1c8cf0bdfd6595251c047ef05a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamersubframe.sty \
texlive-beamersubframe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
