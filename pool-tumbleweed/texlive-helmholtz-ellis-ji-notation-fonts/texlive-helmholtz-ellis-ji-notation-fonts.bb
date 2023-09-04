SUMMARY = "Severed fonts for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "The  separated fonts package for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-fonts-2023.209.1.1svn55213-54.2.noarch.rpm"
RPM_HASH = "d2a18fa89bfc286cdf687daaf8f12ef75c582deaebc7771f96c7b80d3afd7d378f01850f9023e305453d13c5cec1f746c008a94f285d5ae99e292b9525e32883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
