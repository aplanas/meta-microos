SUMMARY = "Documentation for texlive-graphics-cfg"
DESCRIPTION = "This package includes the documentation for texlive-graphics-cfg"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn41448"

RPM_NAME = "texlive-graphics-cfg-doc-2023.201.svn41448-53.1.noarch.rpm"
RPM_HASH = "17b15a8fe1916e1dd694f868c0db81f1d6a59705aaaa3c9b34b130811d880163fcabd34641a18c65222637b2c45aa4265986501830d1b18b626a57649ffa7eae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-cfg-doc"

RDEPENDS:${PN} += ""

inherit rpm
