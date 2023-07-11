SUMMARY = "Documentation for texlive-rcs-multi"
DESCRIPTION = "This package includes the documentation for texlive-rcs-multi"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-doc-2023.201.0.0.1asvn64967-53.2.noarch.rpm"
RPM_HASH = "cbf4336df7918a4ba7832ae886d76e75213d7089b4735cb7bf9d624717b57c9fc24581997a5e5545e2a2578ba482dda960c460eeb8f75ceb2b7327458ea36bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-multi-doc"

RDEPENDS:${PN} += ""

inherit rpm
