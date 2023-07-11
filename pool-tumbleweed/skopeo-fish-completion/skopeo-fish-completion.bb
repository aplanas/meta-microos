SUMMARY = "Fish completion for skopeo"
DESCRIPTION = "This package contains the fish completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "skopeo-fish-completion-1.12.0-1.2.noarch.rpm"
RPM_HASH = "a0d2a6e48dd3e46c7a6074a1531a6315989f9b1ea866857354ed718eb33fee4fdd2741664731dbac569799897078266967336b307b4cf20e4c786df1357bdbdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-fish-completion"

RDEPENDS:${PN} += "fish \
skopeo"

inherit rpm
