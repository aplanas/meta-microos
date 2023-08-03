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

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-opcit-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "c14eaa684af25ed830da04b2bdda20f91821190dbf13606e540b92e26290a2ff58771d3eff8ec73e64d818b2dd8667d2b0112f99698cc1dd9a13f30a179929f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-opcit.sty \
texlive-opcit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
