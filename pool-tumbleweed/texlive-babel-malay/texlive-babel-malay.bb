SUMMARY = "Support for Malay within babel"
DESCRIPTION = "This is the babel style for Malay."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0msvn43234"

RPM_NAME = "texlive-babel-malay-2023.201.1.0msvn43234-53.1.noarch.rpm"
RPM_HASH = "9518cca1fe2a2291d3b7b07da9c7e6f82ec13715481ec2cd2ce308fd696e7eec9e12c253daabf262fb2cd4537b9a1256e0cfb561c1cffaa5714d421a5c1823e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bahasam.ldf \
tex-malay.ldf \
tex-melayu.ldf \
tex-meyalu.ldf \
texlive-babel-malay"

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
