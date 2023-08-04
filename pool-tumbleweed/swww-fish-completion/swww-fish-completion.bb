SUMMARY = "Fish Completion for swww"
DESCRIPTION = "Fish command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "swww-fish-completion-0.8.1-1.1.noarch.rpm"
RPM_HASH = "202c424cd8609f93e66c680edee736c99602616b5f1179bcf2ed642126e38dc947c7e2086cc7cf2dd05c9eb67ebfee90c9e025e95db86a3b5f2d7a5c408fe608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
