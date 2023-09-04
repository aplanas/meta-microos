SUMMARY = "Bash completion for wl-clipboard"
DESCRIPTION = "Bash command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.2.0"

RPM_NAME = "wl-clipboard-bash-completion-2.2.0-1.1.noarch.rpm"
RPM_HASH = "3110a1403fcebdd965ce3d63360f30bf02dd2e145c76fbbc6c1ca926c1092c6b0dc9893623456d0ea748350b10c64436003eda2dc4dcaff94c8b6787d9cbd6f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-bash-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm
