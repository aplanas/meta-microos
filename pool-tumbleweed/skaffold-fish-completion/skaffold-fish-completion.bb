SUMMARY = "Fish Completion for skaffold"
DESCRIPTION = "Fish command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "skaffold-fish-completion-2.7.0-1.1.noarch.rpm"
RPM_HASH = "2c9ea587a8ca3b79799a95d43a77ffa4c1903449c0af6d63aa0cbf000dfda1f4768e9154b26ca2b855849b953f2dd8b1dae536dc0f69b415a016fbdd095f8d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-fish-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
