SUMMARY = "Longtable support with possible X-column specifier"
DESCRIPTION = "This package loads package ltablex, but keeps the current \
tabularx environment as is. The new environment xltabular is a \
combination of longtable and tabularx: Header/footer \
definitions, X-column specifier, and with possible pagebreaks."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2esvn56855"

RPM_NAME = "texlive-xltabular-2023.209.0.0.2esvn56855-53.1.noarch.rpm"
RPM_HASH = "3bce4c55cb287da989ce0c43776c4faab3edaa5a945a7be77f0cbf786af37dae1a256f95ac72a90c65f65dae5fe3566ef2790f6d53929907d5a20f7c7c612607"
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
