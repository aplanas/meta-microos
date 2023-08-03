SUMMARY = "New names for standard BibLaTeX entry type"
DESCRIPTION = "This package adds new fields of 'name' type to the standard \
entry types of BibLaTeX. For example: maineditor, for a \
@collection, means the editor of @mvcollection, and not the \
editor of the @collection. bookineditor, for a @bookinbook, \
means the editor of the entry, and not, as the standard editor \
field, the editor of the volume in which the entry is \
contained."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1svn43049"

RPM_NAME = "texlive-biblatex-morenames-2023.209.1.3.1svn43049-54.1.noarch.rpm"
RPM_HASH = "d3dc2ec6b7595cfe916827fadd6592e5d8416df962df7e9cfe56c7672bad067932861c833f84a3c8840f01f1713e5bd3411c3e601e3bcc67b79ccfcf51b2251b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-morenames.bbx \
texlive-biblatex-morenames"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
