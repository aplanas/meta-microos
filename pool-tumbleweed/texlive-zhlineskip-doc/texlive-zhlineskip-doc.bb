SUMMARY = "Documentation for texlive-zhlineskip"
DESCRIPTION = "This package includes the documentation for texlive-zhlineskip"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0esvn51142"

RPM_NAME = "texlive-zhlineskip-doc-2023.201.1.0esvn51142-52.1.noarch.rpm"
RPM_HASH = "de485f361a04d26a577b93dba173d95febb22f0dd3d2fa82960adc1c6495f18c68f0130a2f1863915d383c398ab5f75f91cfde21660dd8eec8de031213d7b187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-zhlineskip-doc:zh) \
texlive-zhlineskip-doc"
RDEPENDS:${PN} += ""

inherit rpm
