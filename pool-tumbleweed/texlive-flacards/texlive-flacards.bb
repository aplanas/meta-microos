SUMMARY = "Generate flashcards for printing"
DESCRIPTION = "The flacards class provides an easy interface to produce \
flashcards. It will print several cards per page, on both sides \
of the paper."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.1bsvn19440"

RPM_NAME = "texlive-flacards-2023.201.0.0.1.1bsvn19440-52.1.noarch.rpm"
RPM_HASH = "2af53ff3591508b8c9a97f627712db220b49f573a0ea51be28a30e3a7031e35b9d988c3a34e92937393c1ea8ab8cded9558ffc087e713f666d1a099d3fd12a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flacards.cls \
texlive-flacards"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
