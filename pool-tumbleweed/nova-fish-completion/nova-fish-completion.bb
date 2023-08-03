SUMMARY = "Fish Completion for nova"
DESCRIPTION = "Fish command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "nova-fish-completion-3.7.0-1.1.noarch.rpm"
RPM_HASH = "00a11317bfc30d55c0391001fd6d3d5fb3924aa6eb40fe13ebf241ecf661a257678ef646410bf50185f72a2f01db94d87b68b86052c7074773a019cf0682989e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-fish-completion"

RDEPENDS:${PN} += "nova"

inherit rpm
