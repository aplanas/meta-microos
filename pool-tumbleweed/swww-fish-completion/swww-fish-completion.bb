SUMMARY = "Fish Completion for swww"
DESCRIPTION = "Fish command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.7.3"

RPM_NAME = "swww-fish-completion-0.7.3-1.2.noarch.rpm"
RPM_HASH = "0cac0db47e928d69314ce897bc61e2743f1105d75173c719e3e5e17e81652a03797de0c7f3788203a170609ad3ea14608f12bf15b722c3689a8b8b8edbd710c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
