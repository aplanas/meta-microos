SUMMARY = "Fish Completion for skaffold"
DESCRIPTION = "Fish command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.6.1"

RPM_NAME = "skaffold-fish-completion-2.6.1-1.1.noarch.rpm"
RPM_HASH = "e1ff15a80798999f9a55f3f8f3236bca3a6aa0afc14785dd7ea4954ef119d4fe02bd73cf720ac6e1cd16d6552f3d530938adc326e21ed98f199b8769ac58ea31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-fish-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
