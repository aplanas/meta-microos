SUMMARY = "Fish Completion for kubie"
DESCRIPTION = "Fish command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.19.3"

RPM_NAME = "kubie-fish-completion-0.19.3-2.4.noarch.rpm"
RPM_HASH = "c4a6da6be63043c554031b1da5bd073d7e0e7828d6a83a65a3708850dca2ace1685cf50563dc5d2cf31eb1b9c935a4e86de39163ce52d8264535f1dd5271b449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-fish-completion"

RDEPENDS:${PN} += "kubie"

inherit rpm
