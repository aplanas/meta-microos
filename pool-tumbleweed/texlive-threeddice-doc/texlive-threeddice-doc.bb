SUMMARY = "Documentation for texlive-threeddice"
DESCRIPTION = "This package includes the documentation for texlive-threeddice"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn20675"

RPM_NAME = "texlive-threeddice-doc-2023.201.1.0svn20675-54.1.noarch.rpm"
RPM_HASH = "104a6672aecc3fec8f1821b27b9bf55248596a2861ea77b3df089dbd5beb3f2e43e3c9c023dddc1d2c411e62905bc5d554fbbabb4f96f9aa2efa778916816ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeddice-doc"
RDEPENDS:${PN} += ""

inherit rpm
