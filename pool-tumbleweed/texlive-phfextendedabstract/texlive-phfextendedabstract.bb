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

PV = "2023.201.1.0svn60732"

RPM_NAME = "texlive-phfextendedabstract-2023.201.1.0svn60732-51.1.noarch.rpm"
RPM_HASH = "cf02a8f9fc36761c538c3591373eaf52abe5a7fc16fa098a5a792969d60c3d6d5c344f72c1222f89075b24f4434f9f21ba441c6f1c41c4f0bf7610c833da76d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phfextendedabstract.cls) \
texlive-phfextendedabstract"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(geometry.sty) \
tex(kvoptions.sty) \
tex(phfnote.sty) \
tex(phfthm.sty) \
tex(revtex4-2.cls) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
