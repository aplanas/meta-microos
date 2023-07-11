SUMMARY = "Use Fira Code font for listings"
DESCRIPTION = "The lstfiracode package defines FiraCodeStyle for the use with \
the listings package. This style contains almost all ligatures \
in Nikita Prokopov's Fira Code family of fonts."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1csvn49503"

RPM_NAME = "texlive-lstfiracode-2023.208.0.0.1csvn49503-53.1.noarch.rpm"
RPM_HASH = "3764be73f9ef50a47070511ffe20b9ca4c07c54147ecb82c846095986ced024202bb9702e399247404dfd430fa7dcecc05fa5ca4148e652d37d2bc085dcc8ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lstfiracode.sty \
texlive-lstfiracode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-listings.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
