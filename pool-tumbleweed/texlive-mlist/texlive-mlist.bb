SUMMARY = "Logical markup for lists"
DESCRIPTION = "The package defines commands that create macros for typesetting \
vectors, matrices and functions, in a logical way. For example, \
logical indexing can then be used to refer to elements or \
arguments without hard-coding the symbols in the document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6asvn15878"

RPM_NAME = "texlive-mlist-2023.201.0.0.6asvn15878-54.1.noarch.rpm"
RPM_HASH = "a8d6ae2d076cfd62c149b3692af08a933379682e9186bc488446c5fed7e51a9570c6d1a76aac6fb4d3218e367712f70f1ee32a56da9191aafdad8e2a15e1f065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mlist.cfg) \
tex(mlist.sty) \
texlive-mlist"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifmtarg.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
