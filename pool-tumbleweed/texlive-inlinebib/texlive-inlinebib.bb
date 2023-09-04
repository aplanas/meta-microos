SUMMARY = "Citations in footnotes"
DESCRIPTION = "A BibTeX style and a LaTeX package that allow for a full \
bibliography at the end of the document as well as citation \
details in footnotes. The footnote details include 'op. cit.' \
and 'ibid.' contractions."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22018"

RPM_NAME = "texlive-inlinebib-2023.209.svn22018-54.1.noarch.rpm"
RPM_HASH = "c07126eeadb5be84614b5d8cc9e813e647caa2d88a12bc31ca833e00c2df49c7677897d3bd385c1e58e30a5f3e4829fe102991cddb2c4e22905f04f039153cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inlinebib.sty \
tex-pageranges.sty \
texlive-inlinebib"

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
