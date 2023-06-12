SUMMARY = "Maths in a sans font"
DESCRIPTION = "The package defines a new math version sans, and a command \
\\sansmath that behaves somewhat like \\boldmath"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.1svn17997"

RPM_NAME = "texlive-sansmath-2023.201.1.1svn17997-53.1.noarch.rpm"
RPM_HASH = "86c2aec78bbde4b161938aadc55c1d4d22d4614d92a73be6fdb53a85d1a9be59a18c5659231e74b85f673d5012b949cb897be4c96e8eb3f176ea0e9631d42225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sansmath.sty) \
texlive-sansmath"
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
