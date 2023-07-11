SUMMARY = "Experimental memoir support"
DESCRIPTION = "A package of code proposed as supporting material for memoir. \
The package is intended as a test bed for such code, which may \
in the fullness of time be adopted into the main memoir \
release."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn15878"

RPM_NAME = "texlive-memexsupp-2023.208.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "dc8791f2a3d1af1eabfa5ed405e95a21f9a3e5952b98ac59a2a268e2ca96203f63938d9d273e339714290d2fb93ed2ccc37d45e2818dd902fc6bf69ccf97cae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-memexsupp.sty \
texlive-memexsupp"

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
