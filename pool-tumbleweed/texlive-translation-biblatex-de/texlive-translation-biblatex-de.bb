SUMMARY = "German translation of the User Guide for BibLaTeX"
DESCRIPTION = "A German translation of the User Guide for BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.15bsvn59382"

RPM_NAME = "texlive-translation-biblatex-de-2023.201.3.15bsvn59382-52.1.noarch.rpm"
RPM_HASH = "02e83293889e9d8999d84955eab5e82bc390c1dc1d26429bab363f08bf1e1325174b6e06ea8e8ef6b2237b1c02e4a04ec22aef270ca1b315acd5dc10b7ccde00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-biblatex-de"

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
