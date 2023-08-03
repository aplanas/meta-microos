SUMMARY = "Documentation for texlive-glossaries-portuges"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-portuges"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-doc-2023.209.1.1svn36064-54.1.noarch.rpm"
RPM_HASH = "2b9610c5849d0a31e96646baccafd1e354bc4795e732222be1218706f8b4ec3bfc26d7e88c1dc4fdccfab67d970239c2e01c4678f22eda9a9f8b103f8554056b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
