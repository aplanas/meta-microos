SUMMARY = "Bash Completion for river"
DESCRIPTION = "Bash command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-bash-completion-0.2.4+g953-2.1.noarch.rpm"
RPM_HASH = "8ea54463be94c3a9c6bf773582d4bc357fa3dc06d05b7f6d3dbad151b9ba259582f531f2e2b0c8ded7f7ebf350893cf83787da55b710018437d3c589220018c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
