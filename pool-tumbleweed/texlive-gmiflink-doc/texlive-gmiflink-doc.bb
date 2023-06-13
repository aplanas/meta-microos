SUMMARY = "Documentation for texlive-gmiflink"
DESCRIPTION = "This package includes the documentation for texlive-gmiflink"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-doc-2023.201.0.0.97svn15878-53.1.noarch.rpm"
RPM_HASH = "7a55cb55b2e4301d85cb0e9e43f983b8ed5b9ea3b75cd89f14e99f34cf008d9b1bccb288d6fb58e4ec18a236ec56a0a948b46d3a5462b25d607c43c2c548ffbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmiflink-doc"

RDEPENDS:${PN} += ""

inherit rpm
