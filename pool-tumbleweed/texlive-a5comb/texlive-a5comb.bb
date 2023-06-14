SUMMARY = "Support for a5 paper sizes"
DESCRIPTION = "Superceded by geometry."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4svn17020"

RPM_NAME = "texlive-a5comb-2023.201.4svn17020-54.1.noarch.rpm"
RPM_HASH = "2f8f6e658794af25103f7bf329367dd5d25b4247d0cd221920e277ae7ecea95c3b1352c14f5b1c0600d2d83c4d9d054bdb9455d1511b3d8140602138be24961e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a5comb.sty \
texlive-a5comb"

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
