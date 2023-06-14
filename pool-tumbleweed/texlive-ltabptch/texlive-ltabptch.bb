SUMMARY = "Bug fix for longtable"
DESCRIPTION = "A patch for LaTeX bugs tools/3180 and tools/3480. The patch \
applies to version 4.11 of longtable."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.74dsvn17533"

RPM_NAME = "texlive-ltabptch-2023.201.1.74dsvn17533-52.1.noarch.rpm"
RPM_HASH = "6bc92624f9417ab312561f0a4b89de37eeddd3ef10c71e47d10121c92e2e3db95b75609705da7798f28566809f70ddc7e8cc329e97383ab8c8ecc055fcdf010f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltabptch.sty \
texlive-ltabptch"

RDEPENDS:${PN} += "/bin/sh \
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
