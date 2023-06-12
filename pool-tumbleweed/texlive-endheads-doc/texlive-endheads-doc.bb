SUMMARY = "Documentation for texlive-endheads"
DESCRIPTION = "This package includes the documentation for texlive-endheads"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn43750"

RPM_NAME = "texlive-endheads-doc-2023.201.1.6svn43750-53.1.noarch.rpm"
RPM_HASH = "36823b505599494f50a1d5ced88d236434b3abaaa0aab66184ff6d32cd967180f7dd7fe868c3f01bf851df228adc729f1a412481661dd1468a2ebd0132e251cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endheads-doc"
RDEPENDS:${PN} += ""

inherit rpm
