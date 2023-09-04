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

PV = "2023.209.1.7svn30958"

RPM_NAME = "texlive-ijmart-2023.209.1.7svn30958-54.1.noarch.rpm"
RPM_HASH = "7038960b18c011f041231f910cbacc4ca4cd205a53555a71bf131440c9cb3edccfd3b4f4c16b5b33669babcdcbc77c0f9b72b3e4ce2a2a184c1ad9f21efe5b5d"
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
