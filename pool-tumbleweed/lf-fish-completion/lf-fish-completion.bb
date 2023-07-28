SUMMARY = "Fish Completion for lf"
DESCRIPTION = "Fish command-line completion support for lf."
LICENSE = "MIT"

PV = "30"

RPM_NAME = "lf-fish-completion-30-1.1.noarch.rpm"
RPM_HASH = "28bb24b7ac2abd50811efd7aff038068df879d915e5ab7c0ca4f414f2ee313109e371c58e388502ced398a9f5a56b681eb65f028c223a02f2c4a89429db70cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lf-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
