SUMMARY = "Documentation for texlive-libertinus"
DESCRIPTION = "This package includes the documentation for texlive-libertinus"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn61719"

RPM_NAME = "texlive-libertinus-doc-2023.201.0.0.02svn61719-54.1.noarch.rpm"
RPM_HASH = "ad55c1726d90ff4284be88e089ce49d22962e3c124b4c9ecc841f2a057cdd2e74279ee99ecc4e65363188d36fc5a226030a7abacb9811b45dba63c55b58dabfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-doc"

RDEPENDS:${PN} += ""

inherit rpm
