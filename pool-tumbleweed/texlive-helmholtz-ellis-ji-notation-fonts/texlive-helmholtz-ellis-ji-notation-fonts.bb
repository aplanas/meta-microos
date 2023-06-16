SUMMARY = "Severed fonts for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "The  separated fonts package for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-fonts-2023.201.1.1svn55213-53.1.noarch.rpm"
RPM_HASH = "cedd7a8f93d9381bf2232293436c135051d6a94dcc394e7c60ac9cf035c95cddf07d7285ed039554de913ad5a93ec2e6bfdfbb42ddbe738854c7f094f2a7dd9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
