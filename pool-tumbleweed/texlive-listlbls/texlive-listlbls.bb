SUMMARY = "Creates a list of all labels used throughout a document"
DESCRIPTION = "The package aims to help a LaTeX author to keep track of all \
defined labels by typesetting a complete list of labels \
wherever the author requests it. (Of course, the user may need \
to have additional LaTeX runs to get the references right. ) \
This package is based on an answer David Carlisle gave on \
TeX/Stackexchange in the thread 'List of all labels with \
hyperlinks'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn34893"

RPM_NAME = "texlive-listlbls-2023.201.1.03svn34893-54.1.noarch.rpm"
RPM_HASH = "cfefe509a80c0e36ceba6db0acc87432711b3d5555fabf15d6f242bb004537eb4efeb975fd5461cc955e94404d56cd78d812a450af20bc3d0196689109f0e6d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(listlbls.sty) \
texlive-listlbls"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(translations.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
