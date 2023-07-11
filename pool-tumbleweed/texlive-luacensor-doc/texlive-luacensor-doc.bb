SUMMARY = "Documentation for texlive-luacensor"
DESCRIPTION = "This package includes the documentation for texlive-luacensor"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1.0svn62167"

RPM_NAME = "texlive-luacensor-doc-2023.208.1.1.0svn62167-53.1.noarch.rpm"
RPM_HASH = "b7f65fb1de0db5c9d18f9e24d0e5e1b66af5941a5ef5ea23060a840d63f162f9efc88d50c8fee0e151106aa49d271c5df4fe22de52b0e747bdd92adc96345a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
