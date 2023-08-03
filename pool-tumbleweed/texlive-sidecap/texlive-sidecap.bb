SUMMARY = "Typeset captions sideways"
DESCRIPTION = "Defines environments called SCfigure and SCtable (analogous to \
figure and table) to typeset captions sideways. Options include \
outercaption, innercaption, leftcaption and rightcaption."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7asvn65618"

RPM_NAME = "texlive-sidecap-2023.209.1.7asvn65618-54.1.noarch.rpm"
RPM_HASH = "1f37d832c632181291b46e2e7a4802822dad6286d017f35b16b74c54b106fbf74a7bbfea8ffcfeeb71d3f3c34e4cfda5c2cd106249dd0647d0beb03ff070e4ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sidecap.sty \
texlive-sidecap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-ragged2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
