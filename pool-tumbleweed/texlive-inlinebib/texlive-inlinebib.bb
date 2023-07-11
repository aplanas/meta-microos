SUMMARY = "Citations in footnotes"
DESCRIPTION = "A BibTeX style and a LaTeX package that allow for a full \
bibliography at the end of the document as well as citation \
details in footnotes. The footnote details include 'op. cit.' \
and 'ibid.' contractions."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn22018"

RPM_NAME = "texlive-inlinebib-2023.208.svn22018-53.1.noarch.rpm"
RPM_HASH = "f599280f395f17fa8bc826fad59fa2c3146d4432b6f0372cea138e85f67b46ea4fa61632e274b82fddaa801941f19623daeceeae7bf28173847cb549b3facea4"
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
