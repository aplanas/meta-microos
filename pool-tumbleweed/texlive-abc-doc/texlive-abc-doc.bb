SUMMARY = "Documentation for texlive-abc"
DESCRIPTION = "This package includes the documentation for texlive-abc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn41157"

RPM_NAME = "texlive-abc-doc-2023.201.2.0bsvn41157-54.1.noarch.rpm"
RPM_HASH = "2f54617d6b0f403f9cd78becc284284e06ca0d1c8d829df754611d0ae51eb99aba611c47e976b2734d05cff64557fc2e50292cd85570d481be0fcb8533014b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abc-doc"
RDEPENDS:${PN} += ""

inherit rpm
