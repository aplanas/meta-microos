SUMMARY = "Fish Completion for pluto"
DESCRIPTION = "Fish command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.4"

RPM_NAME = "pluto-fish-completion-5.18.4-1.1.noarch.rpm"
RPM_HASH = "79c39f59106d47cd8ebdbda18fcb8383dee5e605095e57a7f2fb007172462f9a6cc5557160089f1f541e1687dcec128938f57bb5422f40c09849f594a5efe75c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-fish-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
