SUMMARY = "Documentation for texlive-ifmslide"
DESCRIPTION = "This package includes the documentation for texlive-ifmslide"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.47svn20727"

RPM_NAME = "texlive-ifmslide-doc-2023.208.0.0.47svn20727-53.1.noarch.rpm"
RPM_HASH = "4853e14508e94e6b6814d6dae04dfd5b3b9fd4353bb8a5ae2c50218b2ced3391c391266047e06090a4690fafc5ff7630aba0d1c91889454448b83d7ae215ee76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifmslide-doc"

RDEPENDS:${PN} += ""

inherit rpm
