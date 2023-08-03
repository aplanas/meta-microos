SUMMARY = "BibTeX variant supporting Unicode (UTF-8), via ICU"
DESCRIPTION = "An enhanced, portable C version of BibTeX. Unicode is supported \
via the ICU library. Originally written by Yannis Haralambous \
and his students, and derived from bibtex8, with substantial \
updates from the Japanese TeX Development Community, it is now \
maintained as part of TeX Live."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.72svn66186"

RPM_NAME = "texlive-bibtexu-2023.209.3.72svn66186-54.1.noarch.rpm"
RPM_HASH = "e86eab76a02c67c641bd8a17d4c5385744a8c3dfdeb2861cb207708e88a4fafbd15693ec677ea6211e25f5e6ee21f366eabe808f507c6d2c096e8c9dd9adf3ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibtexu.1 \
texlive-bibtexu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibtexu-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
