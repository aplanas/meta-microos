SUMMARY = "Fish Completion for pluto"
DESCRIPTION = "Fish command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.2"

RPM_NAME = "pluto-fish-completion-5.18.2-1.1.noarch.rpm"
RPM_HASH = "3b06443de72a86c340e8c6afe7fd306abe0cdc4215503e24a8f7787278c16e7d5e6df9163c1882e0db5ae4b3f6efaabf32f8f087fe38cccbcc865dafaa30b720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-fish-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
