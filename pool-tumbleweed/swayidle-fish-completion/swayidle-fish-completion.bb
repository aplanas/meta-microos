SUMMARY = "Fish completion for swayidle"
DESCRIPTION = "Fish command line completion support for swayidle."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swayidle-fish-completion-1.8.0-1.2.noarch.rpm"
RPM_HASH = "47c0c3650befbc1fc05a5e2244a798dd34e08c62e747968c5e61d6e036682e92ff681438ed0e11a7b3e8ab89181028fb2c4f888d136ca730e6e753b330aecc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swayidle-fish-completion"

RDEPENDS:${PN} += "swayidle"

inherit rpm
