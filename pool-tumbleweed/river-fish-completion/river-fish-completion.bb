SUMMARY = "Fish Completion for river"
DESCRIPTION = "Fish command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g109"

RPM_NAME = "river-fish-completion-0.2.4+g109-3.1.noarch.rpm"
RPM_HASH = "8916e5057a0143489d56bd3480cbeff137c9ab46f1625a5f894d72e69bd5f6a206bb7e7629f8ab64cc96a5332818283c41deed63afb99c028792b7458ae28e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
