SUMMARY = "Bash Completion for bspwm"
DESCRIPTION = "Bash completion for bspc"
LICENSE = "BSD-2-Clause"

PV = "0.9.10"

RPM_NAME = "bspwm-bash-completion-0.9.10-1.12.noarch.rpm"
RPM_HASH = "093dd119387e006b7edda4f54a3f0117565ccbfb4d0f9d7e5a6f993df724003488461cc55d8ebb868715024ba1c4c76e3b9fe78b663ed9956ce21add781ff16a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bspwm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
bspwm"

inherit rpm
