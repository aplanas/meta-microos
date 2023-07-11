SUMMARY = "Fish completion for dust"
DESCRIPTION = "Fish command line completion support for dust."
LICENSE = "Apache-2.0"

PV = "0.8.6"

RPM_NAME = "dust-fish-completion-0.8.6-1.2.noarch.rpm"
RPM_HASH = "4e5e1d36774588b7aaba267fdc28f87ddee9bdc86c16e50322b13791c03a885448cd88087448d841ae80925450e8d6fe6ee4f2a90a8f612b6fd685817a9539ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dust-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
