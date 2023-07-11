SUMMARY = "Functions and objects for the computation of physical quantities"
DESCRIPTION = "This is a pure Lua library, which provides functions and \
objects for the computation of physical quantities. The package \
provides units of the SI and the imperial system. In order to \
display the numbers with measurement uncertainties, the package \
is able to perform Gaussian error propagation."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.5svn59138"

RPM_NAME = "texlive-lua-physical-2023.208.1.0.5svn59138-53.1.noarch.rpm"
RPM_HASH = "28efd34e727976130d746ed89bff0d2eaceb9a23116038f1b6fbf74ba376c432e9ff1b92604083ba41e278881580db666409b68e43604bf872b2d242fccbf34f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-physical"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
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
