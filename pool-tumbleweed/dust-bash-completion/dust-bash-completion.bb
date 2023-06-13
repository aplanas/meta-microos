SUMMARY = "Bash completion for dust"
DESCRIPTION = "Bash command line completion support for dust."
LICENSE = "Apache-2.0"

PV = "0.8.6"

RPM_NAME = "dust-bash-completion-0.8.6-1.1.noarch.rpm"
RPM_HASH = "c2b706e58a465b139d4552b3c543ed0a6d8c61336c83949f148e5b8e853c0e0342b800910cd84adffadd79310177987a2859e4412b909f5464a542c6061dfcd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dust-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
