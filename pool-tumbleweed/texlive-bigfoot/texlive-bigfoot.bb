SUMMARY = "Footnotes for critical editions"
DESCRIPTION = "The package aims to provide a 'one-stop' solution to \
requirements for footnotes. It offers: Multiple footnote \
apparatus superior to that of manyfoot Footnotes can be \
formatted in separate paragraphs, or be run into a single \
paragraph (this choice may be selected per footnote series); \
Things you might have expected (such as \\verb-like material in \
footnotes, and colour selections over page breaks) now work. \
Note that the majority of the bigfoot package's interface is \
identical to that of manyfoot; users should seek information \
from that package's documentation. The bigfoot bundle also \
provides the perpage and suffix packages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1svn38248"

RPM_NAME = "texlive-bigfoot-2023.209.2.1svn38248-54.1.noarch.rpm"
RPM_HASH = "26e02338f6f7e0b92f1712ff2877796f981e0bfd5f61d598ff1f471fa2726fa5494c6c269ab813b38020fa3236f93beb26d8c3b0ed776a6b15c7344b3c3438cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bigfoot.sty \
tex-perpage.sty \
tex-suffix.sty \
texlive-bigfoot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-manyfoot.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
