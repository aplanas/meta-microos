SUMMARY = "Modifying section commands in LaTeX"
DESCRIPTION = "The package implements a pretty extensive scheme to make more \
manageable the business of configuring LaTeX output."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20180"

RPM_NAME = "texlive-section-2023.201.svn20180-53.1.noarch.rpm"
RPM_HASH = "2bd72eda0a90b114506204681302d7783478229b7ee86d1a6b408f40246d5f7f073959a7b4c3722b8187d9698f086df8c13735fd903b3ad35569b30b19f0c68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-section.sty \
texlive-section"

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
