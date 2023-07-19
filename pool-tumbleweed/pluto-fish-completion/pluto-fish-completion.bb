SUMMARY = "Fish Completion for pluto"
DESCRIPTION = "Fish command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.1"

RPM_NAME = "pluto-fish-completion-5.18.1-1.1.noarch.rpm"
RPM_HASH = "d5ecec63bfcfc489b1e6b93cd3f9823912391746e14297c5e5b9d0fec75c408d7d5db5135471e48acde4f2ab6ca5acf01351bc0988d45c26d2118bff2efb9822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-fish-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
