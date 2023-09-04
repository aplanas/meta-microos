SUMMARY = "Fish Completion for zola"
DESCRIPTION = "Fish command-line completion support for zola."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-fish-completion-0.17.2-3.1.noarch.rpm"
RPM_HASH = "5ce9615f360b915a1451413c1c20bde6a69f7f05245aa786dfd826ec40325fa5b9e4976375ceb1401cdbcad6cda5863b8b58535b27a7b84070b2428bb79ec1ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
