SUMMARY = "Underline text allowing line breaking"
DESCRIPTION = "Provides commands \\Underline, \\Midline and \\Overline for \
underlining, striking out, and overlining their text arguments."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19085"

RPM_NAME = "texlive-umoline-2023.201.svn19085-53.1.noarch.rpm"
RPM_HASH = "8e20c007b25d22c1f663699f398a1941f8b6e007bda82aad211b2aa033d430bf45c742bbf03a49bf1ee0b7db78a9626d698430b6710c89c2ebe764e118a8bb7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-umoline.sty \
texlive-umoline"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
