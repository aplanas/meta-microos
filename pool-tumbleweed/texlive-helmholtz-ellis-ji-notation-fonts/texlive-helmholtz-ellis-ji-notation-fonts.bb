SUMMARY = "Severed fonts for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "The  separated fonts package for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-fonts-2023.201.1.1svn55213-53.2.noarch.rpm"
RPM_HASH = "63ff03317accabcbe576872c2f6edf48a18d81d3ef3066253138570b454443194a3535e2848e848cdf60952d9cd3d5df1eb59a286a842d407e7b7c823cf982a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
