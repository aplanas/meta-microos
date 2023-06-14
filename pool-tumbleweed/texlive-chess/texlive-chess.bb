SUMMARY = "Fonts for typesetting chess boards"
DESCRIPTION = "The original (and now somewhat dated) TeX chess font package. \
Potential users should consider skak (for alternative fonts, \
and notation support), texmate (for alternative notation \
support), or chessfss (for flexible font choices)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn20582"

RPM_NAME = "texlive-chess-2023.201.1.2svn20582-53.1.noarch.rpm"
RPM_HASH = "116af0f2b1cdd3f6cd5849243e38116d735fd8b2b3fb4eff53991213d6fe94cc4491717f221ed3050fbf5541a5c91bb0b24dba1c4cb6409ea59cea6ca88ab608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chess.sty \
tex-chess10.tfm \
tex-chess20.tfm \
tex-chess30.tfm \
tex-chessf10.tfm \
tex-chessfig10.tfm \
texlive-chess"

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
