SUMMARY = "Longtable support with possible X-column specifier"
DESCRIPTION = "This package loads package ltablex, but keeps the current \
tabularx environment as is. The new environment xltabular is a \
combination of longtable and tabularx: Header/footer \
definitions, X-column specifier, and with possible pagebreaks."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2esvn56855"

RPM_NAME = "texlive-xltabular-2023.209.0.0.2esvn56855-53.2.noarch.rpm"
RPM_HASH = "535f28e5443854c7069bf8b48ee19e7651c19741f6a2257f87cc80afe7329cf908e9f13ebbbc40ec51d2fbb7e197befc36f08d7c4ffdd27dbf015a21c8fb569e"
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
