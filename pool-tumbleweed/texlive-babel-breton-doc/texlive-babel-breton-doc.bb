SUMMARY = "Documentation for texlive-babel-breton"
DESCRIPTION = "This package includes the documentation for texlive-babel-breton"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn30257"

RPM_NAME = "texlive-babel-breton-doc-2023.201.1.0hsvn30257-53.1.noarch.rpm"
RPM_HASH = "a1da61b64de66a39c4e9f5102a935cd673a20189cd178ddb8c72731296145cd10fc960dbe7332f57ca4a1737d04cb5998a17ebe32e22058cfd16d91108ae2d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-breton-doc"
RDEPENDS:${PN} += ""

inherit rpm
