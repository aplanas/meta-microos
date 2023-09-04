SUMMARY = "Documentation for texlive-glossaries-portuges"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-portuges"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-doc-2023.209.1.1svn36064-54.2.noarch.rpm"
RPM_HASH = "6defe870eed26248cae843190941725ec88ba96d5600cd88d8babb92e9833f921c800e1a50ea5ed2ee2ee0cf4d30ac96c7ef0ee9a0dabe8519915c4bf2c8ffe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
