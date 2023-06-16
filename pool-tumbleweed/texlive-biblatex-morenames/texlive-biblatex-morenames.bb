SUMMARY = "New names for standard BibLaTeX entry type"
DESCRIPTION = "This package adds new fields of 'name' type to the standard \
entry types of BibLaTeX. For example: maineditor, for a \
@collection, means the editor of @mvcollection, and not the \
editor of the @collection. bookineditor, for a @bookinbook, \
means the editor of the entry, and not, as the standard editor \
field, the editor of the volume in which the entry is \
contained."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1svn43049"

RPM_NAME = "texlive-biblatex-morenames-2023.201.1.3.1svn43049-53.1.noarch.rpm"
RPM_HASH = "fdaef0d59d49c3176f8c8a95ce8774b8d91e7749b2b5d1824026e21f36b93f1eb6d8272206e83561deb19059fd1c73fadf6f43eabd80dd326d3f556124f3996c"
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
