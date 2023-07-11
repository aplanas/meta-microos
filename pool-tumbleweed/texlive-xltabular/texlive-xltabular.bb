SUMMARY = "Longtable support with possible X-column specifier"
DESCRIPTION = "This package loads package ltablex, but keeps the current \
tabularx environment as is. The new environment xltabular is a \
combination of longtable and tabularx: Header/footer \
definitions, X-column specifier, and with possible pagebreaks."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2esvn56855"

RPM_NAME = "texlive-xltabular-2023.201.0.0.2esvn56855-52.2.noarch.rpm"
RPM_HASH = "b052a89a18a628e205a407b34b0e3c4bf99d6ab4f3d59ed9ea8d98ed87fbebc2c16d19c4fa2c8e0791368761ed2f1b0d51f0f0757653d3f21487c265f4d6f61e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xltabular.sty \
texlive-xltabular"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltablex.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
