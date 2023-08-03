SUMMARY = "Logical markup for lists"
DESCRIPTION = "The package defines commands that create macros for typesetting \
vectors, matrices and functions, in a logical way. For example, \
logical indexing can then be used to refer to elements or \
arguments without hard-coding the symbols in the document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6asvn15878"

RPM_NAME = "texlive-mlist-2023.209.0.0.6asvn15878-55.1.noarch.rpm"
RPM_HASH = "f720c254276c73cb4dea7209f788cac84ad2c7954ded1e03c0920cf8fb0ad5716a64ddb3f185c4fadeae0c1fe7ba232eba4080768a48ac30ed18740a495dd5dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mlist.cfg \
tex-mlist.sty \
texlive-mlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifmtarg.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
