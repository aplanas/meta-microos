SUMMARY = "Fish Completion for swww"
DESCRIPTION = "Fish command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "swww-fish-completion-0.8.1-2.1.noarch.rpm"
RPM_HASH = "3f3606f655faa2a5b9229658f1f4f34d54daec27b19ced4314b7c07c854ad102f1ededb3d4ff49bd4c67579457a32c5ac9bd99279d31eb12a717f0665feaabff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
