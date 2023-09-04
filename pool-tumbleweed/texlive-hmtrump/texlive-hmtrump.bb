SUMMARY = "Describe card games"
DESCRIPTION = "This package provides a font with LuaLaTeX support for \
describing card games."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-2023.209.1.2asvn54512-54.2.noarch.rpm"
RPM_HASH = "7073f1272dc510c0c0f792ef6861ce1abde192915a3a134344fa1bd7fc55a577f867f75a37148d50b17f63479365008f8e1b8f7e12dc35ba3d82a4d7719b7c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hmtrump.sty \
texlive-hmtrump"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-hmtrump-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
