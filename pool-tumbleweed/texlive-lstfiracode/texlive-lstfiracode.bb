SUMMARY = "Use Fira Code font for listings"
DESCRIPTION = "The lstfiracode package defines FiraCodeStyle for the use with \
the listings package. This style contains almost all ligatures \
in Nikita Prokopov's Fira Code family of fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1csvn49503"

RPM_NAME = "texlive-lstfiracode-2023.201.0.0.1csvn49503-52.1.noarch.rpm"
RPM_HASH = "172da0bcc451e13825d3bdbbdb0e0bf83459f44c0ff9b6d065af0c010ea393adf4fa53efb57ba5d6411146d915ae16a884ca888e223f3c53a6305ff38d789839"
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
