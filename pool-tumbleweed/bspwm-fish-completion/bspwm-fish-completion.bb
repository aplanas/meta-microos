SUMMARY = "Fish Completion for bspwm"
DESCRIPTION = "Fish completion for bspc"
LICENSE = "BSD-2-Clause"

PV = "0.9.10"

RPM_NAME = "bspwm-fish-completion-0.9.10-1.12.noarch.rpm"
RPM_HASH = "e199531349c28a73356aaee2654d919d56e3e5a093fe36490b663b891c29e29ed0d9fa0df35c9b3ebe8ca066a4d2e7b04f92dd83321d329cd4e8d01268b130e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bspwm-fish-completion"

RDEPENDS:${PN} += "bspwm"

inherit rpm
