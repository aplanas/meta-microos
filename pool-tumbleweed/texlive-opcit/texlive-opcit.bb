SUMMARY = "Footnote-style bibliographical references"
DESCRIPTION = "This package addresses the problem of expressing citations in a \
style that is natural for humanities studies, yet does not \
interfere with the flow of text (as author-year styles do). The \
package differs from footbib in that it uses real footnotes, \
potentially in the same series as any of the document's other \
footnotes. Opcit also, as its name implies, avoids repetition \
of full citations, achieving this, to a large extent, \
automatically."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-opcit-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "7c0653bd73370028c6419889bd39246cdcb63bc892809ae72229a704163ad6c305bc5065d37a27a49bc276ef180e0bd34e50d42e36ac3ae668f94a1fed4033ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(opcit.sty) \
texlive-opcit"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
