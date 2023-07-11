SUMMARY = "Bug fix for longtable"
DESCRIPTION = "A patch for LaTeX bugs tools/3180 and tools/3480. The patch \
applies to version 4.11 of longtable."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.74dsvn17533"

RPM_NAME = "texlive-ltabptch-2023.208.1.74dsvn17533-53.1.noarch.rpm"
RPM_HASH = "89b6843fe98720941c735b9068639e2ea2d139465bcb76628a738e7298258b6fa043de9dab3048a138f902a43129ff0abe509b92a39e047743d3a77aca262620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltabptch.sty \
texlive-ltabptch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
