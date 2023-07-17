SUMMARY = "Cross-vendor public domain suffix database"
DESCRIPTION = "The Public Suffix List is a cross-vendor initiative to provide \
an accurate list of domain name suffixes, maintained by the hard work \
of Mozilla volunteers and by submissions from registries. \
Software using the Public Suffix List will be able to determine where \
cookies may and may not be set, protecting the user from being \
tracked across sites."
LICENSE = "MPL-2.0"

PV = "20230709"

RPM_NAME = "publicsuffix-20230709-1.1.noarch.rpm"
RPM_HASH = "28d4dcf67374f367a291df48328c4f0ce92f7a26851bb6462e742530509270ceb40402bb4e96e737458596e29158dfcefddcbb1c32015bd83fe1ccb3403a8458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "publicsuffix"

RDEPENDS:${PN} += ""

inherit rpm
