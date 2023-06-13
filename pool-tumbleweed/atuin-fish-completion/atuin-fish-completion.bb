SUMMARY = "Fish completion for atuin"
DESCRIPTION = "Fish command line completion support for atuin."
LICENSE = "MIT"

PV = "14.0.1"

RPM_NAME = "atuin-fish-completion-14.0.1-1.1.noarch.rpm"
RPM_HASH = "1b998962766fdfaae30657cd9f8a565c25924d9df762f075196846d0b3713bf3fc13ca3302a839cd9dfc9084dd02916d0cdf9a566b2be6f96cc8ea1fbb400d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-fish-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm
