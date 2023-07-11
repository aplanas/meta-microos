SUMMARY = "Documentation for texlive-mathspec"
DESCRIPTION = "This package includes the documentation for texlive-mathspec"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2bsvn42773"

RPM_NAME = "texlive-mathspec-doc-2023.208.0.0.2bsvn42773-53.1.noarch.rpm"
RPM_HASH = "66405a0401a2ed813eabd6616bd7fa868f5af991594903d8e71e88579433fee66f64c79fc5cfabedfd5996be0a10371ea2a976a4c83d3a4a03703ac587118096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathspec-doc"

RDEPENDS:${PN} += ""

inherit rpm
