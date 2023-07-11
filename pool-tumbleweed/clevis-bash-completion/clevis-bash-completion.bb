SUMMARY = "Bash completion for Clevis"
DESCRIPTION = "This package provides Bash completion for Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-bash-completion-19-2.2.aarch64.rpm"
RPM_HASH = "2899acb4ada0b0d25cb5e48e608cc73b35d83635c15da7029e13fed47132a5c58e26cec91795ca7812da1734ede7da10290f865b64d3b08b157e58976006684e"

RPROVIDES:${PN} += "clevis-bash-completion"

RDEPENDS:${PN} += "bash-completion \
clevis"

inherit rpm
