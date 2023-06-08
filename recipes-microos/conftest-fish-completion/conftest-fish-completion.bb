SUMMARY = "Fish Completion for conftest"
DESCRIPTION = "Fish command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.42.1"

RPM_NAME = "conftest-fish-completion-0.42.1-1.1.noarch.rpm"
RPM_HASH = "fb0bd0cb4af4a9292118fb6d8e94a0231a443e904114cd7ec7521403e72fbe6cdce7615ef27329dc07fc7131a4856055f125b850aa447e49132e3e8443fc80b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-fish-completion"
RDEPENDS:${PN} += "conftest"

inherit rpm
