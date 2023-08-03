SUMMARY = "Font actions in XeTeX according to what is being processed"
DESCRIPTION = "The package takes care of switching fonts when you switch from \
one Unicode block to another in the text of a document. This \
way, you can write a document with no explicit font selection, \
but a series of rules of the form 'when entering block ..., \
switch font to use ...'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.6svn64782"

RPM_NAME = "texlive-ucharclasses-2023.209.2.6svn64782-54.1.noarch.rpm"
RPM_HASH = "dec74bbd58c4a3d8238a9bacb209ee6a4441879fa9648b101a0a6c47d44a0d5c0d9a2faf78bafb72025b3ca6628c387714b18f35fcb7ea8c5ec4f37d19fd540f"
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
