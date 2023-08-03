SUMMARY = "Babel support for typesetting Swedish"
DESCRIPTION = "The package provides the language definition file for Swedish."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3esvn57647"

RPM_NAME = "texlive-babel-swedish-2023.209.2.3esvn57647-54.1.noarch.rpm"
RPM_HASH = "c9b9f82a4f6db827f253a1f2282987dca34318b591f7ae4a4de4c2f8990e61ca07f68c0e39d7a417ddf7ceffc50eaea86ed2c6b6ac056c1ec99a8418e1a904d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swedish.ldf \
texlive-babel-swedish"

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
