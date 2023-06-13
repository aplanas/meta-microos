SUMMARY = "BibTeX implementation of China's bibliography style standard GB/T 7714-2015"
DESCRIPTION = "The package provides a BibTeX implementation for the Chinese \
national bibliography style standard GB/T 7714-2015. It \
consists of two bst files for numerical and author-year styles \
as well as a LaTeX package which provides the citation style \
defined in the standard. The package is compatible with natbib \
and supports language detection (Chinese and English) for each \
biblilography entry."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.5svn64633"

RPM_NAME = "texlive-gbt7714-2023.201.2.1.5svn64633-52.1.noarch.rpm"
RPM_HASH = "0c685be77e3455f4fe7da9ac8d0e87bf92a70bcaaa5228374ae7db8e836a40873ee6c7f4b5326c6d3c7a11a23871bd0e297ef23928beb8e05a31b5dfb1d349d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gbt7714.sty) \
texlive-gbt7714"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(natbib.sty) \
tex(url.sty) \
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
