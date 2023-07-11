SUMMARY = "Documentation for texlive-ecc"
DESCRIPTION = "This package includes the documentation for texlive-ecc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-ecc-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "9ff5216b791e474ef00da906c7c8f032aeb2eb4b5700fcfd9a75f9e322e9aa96353499a2e85f2fc86320d8e469c9067458ce6bd7910ac371d9d7b5c4f5f6b619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecc-doc"

RDEPENDS:${PN} += ""

inherit rpm
