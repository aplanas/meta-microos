SUMMARY = "Class for documentation"
DESCRIPTION = "An article-based class designed for use for documentation in \
high-technology companies."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-2023.209.0.0.0betasvn15878-54.1.noarch.rpm"
RPM_HASH = "97d805e0b8c6907abf39dbc49e8aa8a54ada7b2b1c0efe54d000c6381c9fd782cf5f56f870cd01d4362d48ba169a9f348570a2f2e4b144f91a04ddc6ee5d5676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hitec.cls \
texlive-hitec"

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
