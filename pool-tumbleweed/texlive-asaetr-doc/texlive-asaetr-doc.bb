SUMMARY = "Documentation for texlive-asaetr"
DESCRIPTION = "This package includes the documentation for texlive-asaetr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0asvn15878"

RPM_NAME = "texlive-asaetr-doc-2023.201.1.0asvn15878-53.1.noarch.rpm"
RPM_HASH = "88e1c257994d5edfa4000b30b110156a86985df9d036c376fcb6eb0fc1d9c1694a768eabe3ebcd86717a3028fc866f0b3cbcfeeac972ae038305b571c4f9a53f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asaetr-doc"

RDEPENDS:${PN} += ""

inherit rpm
