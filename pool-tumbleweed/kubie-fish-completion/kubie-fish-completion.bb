SUMMARY = "Fish Completion for kubie"
DESCRIPTION = "Fish command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.22.0"

RPM_NAME = "kubie-fish-completion-0.22.0-1.1.noarch.rpm"
RPM_HASH = "42dd5e2ae2761419ecbf697b444ed6c45e33aaf52a16f04846582b97250e3f2445cbf56c4ea9e0c485ad8a3426991e4b7db2d58392ba81ba173cd0b1609243e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-fish-completion"

RDEPENDS:${PN} += "kubie"

inherit rpm
