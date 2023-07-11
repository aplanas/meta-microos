SUMMARY = "Documentation for texlive-epsincl"
DESCRIPTION = "This package includes the documentation for texlive-epsincl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-doc-2023.201.0.0.2svn29349-53.2.noarch.rpm"
RPM_HASH = "ecc07ece6f03e8c3554b2c05e4ffb11c189e55d5c2e2f1fa77e71cbba629126441bbbef8bcd134aa06e5dece0bd76debee72508fad89eb6e3274b50ca37a11f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsincl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
