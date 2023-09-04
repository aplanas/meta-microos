SUMMARY = "Disable/enable hypenation"
DESCRIPTION = "This package can disable all hyphenation or enable hyphenation \
of non-alphabetics or monospaced fonts. The package can also \
enable hyphenation within 'words' that contain non-alphabetic \
characters (e.g., that include underscores), and hyphenation of \
text typeset in monospaced (e.g., cmtt) fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3csvn15878"

RPM_NAME = "texlive-hyphenat-2023.209.2.3csvn15878-54.1.noarch.rpm"
RPM_HASH = "bda244e3500f8e700b7bd52b06bce120776bdc11466097c111812cc4303cd0b1f562092bfc503fd782bcf7924c506c017ebc220fabbe759219455560b035dbbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyphenat.sty \
texlive-hyphenat"

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
