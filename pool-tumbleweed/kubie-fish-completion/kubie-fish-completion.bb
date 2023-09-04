SUMMARY = "Fish Completion for kubie"
DESCRIPTION = "Fish command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.21.2"

RPM_NAME = "kubie-fish-completion-0.21.2-1.1.noarch.rpm"
RPM_HASH = "b84169b396908251d50b0bcfe2f0caae77c09fe941557ce2d93eccbe382a9d1484e61ca7aff75e859f48c57e09755ba9b62ee453cdebfe98ca733fa12b71efdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-fish-completion"

RDEPENDS:${PN} += "kubie"

inherit rpm
