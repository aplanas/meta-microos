SUMMARY = "Documentation for texlive-abstract"
DESCRIPTION = "This package includes the documentation for texlive-abstract"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn15878"

RPM_NAME = "texlive-abstract-doc-2023.201.1.2asvn15878-54.1.noarch.rpm"
RPM_HASH = "1adf9eca6af7d0b975ecb938b98a019c119f3d19e9fadbb08b13fa4918d5c18a7d32c37f46f1c827468fde493de8344f27bd618d307a220868cca15fc52eb9e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abstract-doc"

RDEPENDS:${PN} += ""

inherit rpm
