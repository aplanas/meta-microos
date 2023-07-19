SUMMARY = "Fish Completion for kubie"
DESCRIPTION = "Fish command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.20.1"

RPM_NAME = "kubie-fish-completion-0.20.1-1.1.noarch.rpm"
RPM_HASH = "2bfb02cce2838ea389722187c6c9eb6bd4c238b63ced303b8327a1d27ad50f603cee7fd4518bfd24578272ce0949ae2f95b26be680eeac36f3b5beeea5ab29bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-fish-completion"

RDEPENDS:${PN} += "kubie"

inherit rpm
