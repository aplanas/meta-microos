SUMMARY = "Adobe Type 1 format of Carolingian Minuscule fonts"
DESCRIPTION = "The bundle offers Adobe Type 1 format versions of Peter \
Wilson's Carolingian Minuscule font set (part of the bookhands \
collection). The fonts in the bundle are ready-to-use \
replacements for the Metafont originals."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-carolmin-ps-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "ae0415dc7c7a9585e2ffd3655e336ee041111fe21591507de687b94de4ab3b5ad2b79e1c9a9702d2da5838e3c2e6c01d59506e6d220176c2005581566701cc01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmin.map \
texlive-carolmin-ps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-carolmin-ps-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
