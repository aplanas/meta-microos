SUMMARY = "Documentation for texlive-bbcard"
DESCRIPTION = "This package includes the documentation for texlive-bbcard"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn19440"

RPM_NAME = "texlive-bbcard-doc-2023.201.svn19440-53.1.noarch.rpm"
RPM_HASH = "1fe7e3915fb33acbe4b3e27a181237ff7e783b76aa37016a8e4f77cbb4d4003e2a2c1e43bd0592ee8bd1eca4ed9630f8cbdf678a30f978a2d338e22b8ea967d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbcard-doc"

RDEPENDS:${PN} += ""

inherit rpm
