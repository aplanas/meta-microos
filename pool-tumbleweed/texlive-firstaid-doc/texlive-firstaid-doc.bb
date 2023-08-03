SUMMARY = "Documentation for texlive-firstaid"
DESCRIPTION = "This package includes the documentation for texlive-firstaid"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0usvn64892"

RPM_NAME = "texlive-firstaid-doc-2023.209.1.0usvn64892-53.1.noarch.rpm"
RPM_HASH = "489dcddd7fed4e1e0c8fdc2c4d45aca7a60cfc8c99f5333229e90f7ef670bab6aa81773568e9c1d170488b319e8d4e21c7e17210d81039938d2bd9ddb578f64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firstaid-doc"

RDEPENDS:${PN} += ""

inherit rpm
