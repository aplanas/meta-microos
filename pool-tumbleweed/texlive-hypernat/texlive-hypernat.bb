SUMMARY = "Allow hyperref and natbib to work together"
DESCRIPTION = "Allows hyperref package and the natbib package with options \
'numbers' and 'sort&compress' to work together. This means that \
multiple sequential citations (e.g [3,2,1]) will be compressed \
to [1-3], where the '1' and the '3' are (color-)linked to the \
bibliography."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0bsvn17358"

RPM_NAME = "texlive-hypernat-2023.209.1.0bsvn17358-54.1.noarch.rpm"
RPM_HASH = "72cab6d35aa56af3bd79584ee9ec55c34b9e9c00f7c7c9b880ddd8f8709f96af45e2a1742293a0ba5758e713ec58cf2dfa88221fe01da681dc3043c7270618e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypernat.sty \
texlive-hypernat"

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
