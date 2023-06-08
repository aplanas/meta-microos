SUMMARY = "Bash completion for Clevis"
DESCRIPTION = "This package provides Bash completion for Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-bash-completion-19-1.1.aarch64.rpm"
RPM_HASH = "8594b80435ccb5e4a69c88887371deb6b0d49534dd41788bc2642f206d436186788c0b734134c8e18b969c7a79de3c91bb64055139bebabc534059e458666ca1"

RPROVIDES:${PN} += "clevis-bash-completion clevis-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion clevis"

inherit rpm
