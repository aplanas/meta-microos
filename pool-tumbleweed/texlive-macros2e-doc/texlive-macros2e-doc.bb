SUMMARY = "Documentation for texlive-macros2e"
DESCRIPTION = "This package includes the documentation for texlive-macros2e"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4asvn64967"

RPM_NAME = "texlive-macros2e-doc-2023.208.0.0.4asvn64967-53.1.noarch.rpm"
RPM_HASH = "21f264f1e2e942e9357c5feab5a459170637c95eab8dbaf3583d98094e0385a8f79ad06f442f13d9521526622bc4eb50d370bd92d6b8f7f3a0aed8acfb257158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-macros2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
