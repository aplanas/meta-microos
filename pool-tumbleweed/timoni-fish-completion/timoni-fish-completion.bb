SUMMARY = "Fish Completion for timoni"
DESCRIPTION = "Fish command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "timoni-fish-completion-0.10.0-1.1.noarch.rpm"
RPM_HASH = "1975af363d01225d01940ce7a93dd8b5138fbc43e109d4b5d09cd7b49c3d19ec6617591384d93c8ca1c4aa0b60fe28b00bfad85ff13b814e32c95ca0a9ac93d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-fish-completion"

RDEPENDS:${PN} += "timoni"

inherit rpm
