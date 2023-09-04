SUMMARY = "Fish Completion for skaffold"
DESCRIPTION = "Fish command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.6.3"

RPM_NAME = "skaffold-fish-completion-2.6.3-1.1.noarch.rpm"
RPM_HASH = "e119f03a15b9d755e3e0188ca415d5d41dde9360cda261dbbabd5c27af81c3b18d3f7a11d1fe7c2f973ceba169a69d9d638273d401828bbeedc6ef26d704dc93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-fish-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
