SUMMARY = "BibTeX implementation of China's bibliography style standard GB/T 7714-2015"
DESCRIPTION = "The package provides a BibTeX implementation for the Chinese \
national bibliography style standard GB/T 7714-2015. It \
consists of two bst files for numerical and author-year styles \
as well as a LaTeX package which provides the citation style \
defined in the standard. The package is compatible with natbib \
and supports language detection (Chinese and English) for each \
biblilography entry."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.5svn64633"

RPM_NAME = "texlive-gbt7714-2023.209.2.1.5svn64633-53.1.noarch.rpm"
RPM_HASH = "43425b3f23e654b0d7e7d5e693d48524f43d841f5aeac3d4798d9d3c7d9cface06d452333ed14e6ca90c0606ccaf6aefda5beacb4fdd657a6c6f0660ecacbcac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gbt7714.sty \
texlive-gbt7714"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-natbib.sty \
tex-url.sty \
texlive \
texlive-bibtex \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-natbib \
texlive-scripts \
texlive-scripts-bin \
texlive-url"

inherit rpm
