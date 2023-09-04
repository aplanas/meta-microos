SUMMARY = "Fonts for typesetting Tolkien Elvish scripts"
DESCRIPTION = "The bundle provides fonts for Cirth (cirth.mf, etc.) and for \
Tengwar (teng10.mf). The Tengwar fonts are supported by macros \
in teng.tex, or by the (better documented) tengtex package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-elvish-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "0824f08ae6a25b86f44a1631c97ac0f58a80ebc1ea08d43e8b3c9e96c62f093c7bef3fb33875af858ad1864b8c91d21c3cd072004fc2702e44b55a507d92e008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cirth.tfm \
tex-teng10.tfm \
texlive-elvish"

RDEPENDS:${PN} += "/usr/bin/sh \
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
