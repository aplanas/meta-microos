SUMMARY = "Documentation for texlive-gb4e"
DESCRIPTION = "This package includes the documentation for texlive-gb4e"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19216"

RPM_NAME = "texlive-gb4e-doc-2023.209.svn19216-53.1.noarch.rpm"
RPM_HASH = "a6252a64c6cbf949a4e84d0b9bd3058f6a0b61170cd46712d9f25fb994800daeccebfdba9b1db763d966b4860036028c8b5a0453c86800d5f946a3a9f9b43ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gb4e-doc"

RDEPENDS:${PN} += ""

inherit rpm
