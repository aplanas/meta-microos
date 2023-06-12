SUMMARY = "Fish completion for bat"
DESCRIPTION = "Fish command line completion support for bat."
LICENSE = "Apache-2.0 | MIT"

PV = "0.23.0"

RPM_NAME = "bat-fish-completion-0.23.0-1.1.noarch.rpm"
RPM_HASH = "ee99af536fd2b2e75d88cdd840a6e99b3665726c140781d1e353906091dca09410305678f12ace311a81913fdb793d879d687ba62faf25c56a410e10ad223a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-fish-completion"
RDEPENDS:${PN} += "bat"

inherit rpm
