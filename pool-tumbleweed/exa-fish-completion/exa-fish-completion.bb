SUMMARY = "Fish completion for exa"
DESCRIPTION = "Fish command line completion support for exa."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-fish-completion-0.10.1-3.4.noarch.rpm"
RPM_HASH = "1cc43be8cf29d3e0c5347bbfea02893275085e3069f12aca7e8d69cd60ee85a70be520f64898b0cb6c05aa95b61ecc7d7ea8eac78cb341f58cacf10919dc9c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exa-fish-completion"
RDEPENDS:${PN} += "exa"

inherit rpm
