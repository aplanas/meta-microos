SUMMARY = "Documentation for texlive-grid-system"
DESCRIPTION = "This package includes the documentation for texlive-grid-system"
LICENSE = "Apache-1.0"

PV = "2023.201.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-doc-2023.201.0.0.3.0svn32981-53.2.noarch.rpm"
RPM_HASH = "a4bbfc0e6d501c53af3c46c9f3e24af70536ecc257e096cb7e6bad05abd1062c2dabdc9ca83a46582cec987e1cf234a51c708a9dd10cdc1fd51fe6ef2b9b6e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-system-doc"

RDEPENDS:${PN} += ""

inherit rpm
