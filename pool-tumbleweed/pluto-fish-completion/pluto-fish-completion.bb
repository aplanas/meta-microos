SUMMARY = "Fish Completion for pluto"
DESCRIPTION = "Fish command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.17.0"

RPM_NAME = "pluto-fish-completion-5.17.0-1.1.noarch.rpm"
RPM_HASH = "9f8b7edd7eeb227c9c24a7a01ed458fb764aef9997b85f477b4890d7a6805026817bd1173cb5f9c9c21865c5894f3d3a224d7c86781fcbbec33f2b4bd3d27f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-fish-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
