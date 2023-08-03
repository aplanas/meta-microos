SUMMARY = "Typeset extended abstracts for conferences, such as often encountered in quantum information theory"
DESCRIPTION = "Several conferences in various fields (such as quantum \
information theory) require the submission of extended \
abstracts. An extended abstract is a summary of a scientific \
result, presented at a high level, and consisting of at most a \
small handful of pages. The phfextendedabstract LaTeX class \
provides a simple style for such abstracts. There are only two \
sectioning levels, sections and paragraphs, and the style is \
optimized to save space as well as to guide the reader's eye \
through the overall structure of the document. An option will \
try to compress all vertical space to save some space, in case \
you need to satisfy page constraints. The style builds upon the \
powerful RevTeX class, so you can use all of RevTeX's features \
such as author affiliations, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn60732"

RPM_NAME = "texlive-phfextendedabstract-2023.209.1.0svn60732-52.1.noarch.rpm"
RPM_HASH = "8fd82efaf6d4bd8f0ebed8d9c2f585bed600b42c8162d4900f3b80a422ba10f2c63c6f7ed985289103834055d7d15197364d280497e6d655797ce6a0b4ee57b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfextendedabstract.cls \
texlive-phfextendedabstract"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
tex-kvoptions.sty \
tex-phfnote.sty \
tex-phfthm.sty \
tex-revtex4-2.cls \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
