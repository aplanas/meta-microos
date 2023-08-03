SUMMARY = "Documentation for texlive-chemgreek"
DESCRIPTION = "This package includes the documentation for texlive-chemgreek"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn53437"

RPM_NAME = "texlive-chemgreek-doc-2023.209.1.1asvn53437-54.1.noarch.rpm"
RPM_HASH = "2bb797288de0851226f70c284d48b2110b78c71f5dd5c90c2fc67d57372b2d1517b40145c30dbf8930a0a8d9573ec96ceee68a45ad8eba7b90c7548a2e970d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
