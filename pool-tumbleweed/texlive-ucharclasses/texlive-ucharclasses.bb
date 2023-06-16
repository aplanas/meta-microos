SUMMARY = "Font actions in XeTeX according to what is being processed"
DESCRIPTION = "The package takes care of switching fonts when you switch from \
one Unicode block to another in the text of a document. This \
way, you can write a document with no explicit font selection, \
but a series of rules of the form 'when entering block ..., \
switch font to use ...'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.6svn64782"

RPM_NAME = "texlive-ucharclasses-2023.201.2.6svn64782-53.1.noarch.rpm"
RPM_HASH = "2be0c3ebfffe130bd6f733aaf014368f06921786637482ca7e5a305e508ebe6a421bf5dd49ec4107f74d5ca8a3b29bbaa63df077e302fa6816dc3f4dc90d9bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucharclasses.sty \
texlive-ucharclasses"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifxetex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
