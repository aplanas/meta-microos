SUMMARY = "Fish completion for gh"
DESCRIPTION = "Fish command line completion support for gh."
LICENSE = "MIT"

PV = "2.34.0"

RPM_NAME = "gh-fish-completion-2.34.0-1.1.noarch.rpm"
RPM_HASH = "64d16212396b734c56991eba985bab5556f8473df5baaff2749be2e76836df8b2bdcfa79be28d952f0ad5bb4dd15547947751b34fcd1aeaf7965065e679c61c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-fish-completion"

RDEPENDS:${PN} += "gh"

inherit rpm
