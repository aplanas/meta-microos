SUMMARY = "LaTeX Class for the Israel Journal of Mathematics"
DESCRIPTION = "The Israel Journal of Mathematics is published by The Hebrew \
University Magnes Press. This class provides LaTeX support for \
its authors and editors. It strives to achieve the distinct \
'look and feel' of the journal, while having the interface \
similar to that of the amsart document class. This will help \
authors already familiar with amsart to easily submit \
manuscripts for The Israel Journal of Mathematics or to put the \
preprints in arXiv with minimal changes in the LaTeX source."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.7svn30958"

RPM_NAME = "texlive-ijmart-2023.208.1.7svn30958-53.1.noarch.rpm"
RPM_HASH = "44df2a296980f06b571d13c2bc21f8147321fe8414531bfba995cddd9f74835ab7faf7b38aa1bed696e53c0a06c7a3bbb4db98af3760d87c49c9f30bfcf94564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ijmart.cls \
texlive-ijmart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsart.cls \
tex-fancyhdr.sty \
tex-ifpdf.sty \
tex-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
