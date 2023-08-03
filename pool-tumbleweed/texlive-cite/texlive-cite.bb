SUMMARY = "Improved citation handling in LaTeX"
DESCRIPTION = "The package supports compressed, sorted lists of numerical \
citations, and also deals with various punctuation and other \
issues of representation, including comprehensive management of \
break points. The package is compatible with both hyperref and \
backref. The package is (unsurprisingly) part of the cite \
bundle of the author's citation-related packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.5svn36428"

RPM_NAME = "texlive-cite-2023.209.5.5svn36428-54.1.noarch.rpm"
RPM_HASH = "16f5815a4b65cbcff46d091042e9e15ed09386b6c5e7b8ee71f4c64831f05ffb9cc2041ca423d02d1e1353e8b1e07082353721cd4cf67e45d9e15b7ae77dbcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chapterbib.sty \
tex-cite.sty \
tex-drftcite.sty \
tex-overcite.sty \
texlive-cite"

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
