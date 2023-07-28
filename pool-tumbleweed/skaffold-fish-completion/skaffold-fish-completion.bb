SUMMARY = "Fish Completion for skaffold"
DESCRIPTION = "Fish command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.6.2"

RPM_NAME = "skaffold-fish-completion-2.6.2-1.1.noarch.rpm"
RPM_HASH = "1be5615f01c3160d218803eccdf9c04b0ff8ac5cbb02a9f303fe484c56ea77afbbd19ab293d4f5da6fe5506e9beb821e890fafbac7a3b4727e8b9a0fcac893aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-fish-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
