SUMMARY = "Fish completion for docker"
DESCRIPTION = "Fish command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.5_ce"

RPM_NAME = "docker-fish-completion-24.0.5_ce-2.1.noarch.rpm"
RPM_HASH = "190fef766169f924aaba56bfbc745ebfaae6e49599bf7974e0e9928fbb255d3258f32082802101fb83d86e82d85c2f2752c1666ffedf4147e62f6ccce1d0f773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-fish-completion"

RDEPENDS:${PN} += "docker \
fish"

inherit rpm
