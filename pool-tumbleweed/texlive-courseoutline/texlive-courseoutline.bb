SUMMARY = "Prepare university course outlines"
DESCRIPTION = "Courseoutline is a class designed to minimise markup in a \
tedious task that needs to be repeated often."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn15878"

RPM_NAME = "texlive-courseoutline-2023.204.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "3be8a332cc6e2ed2ff5d2297b55872adbe02dd0ded5fa32abbbf3255cd1f88438a635f23fbc766affeee484a2f13f8a05df5f8f41d6600efbaf4d0fb27c94728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(courseoutline.cls) \
texlive-courseoutline"

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
