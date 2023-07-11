SUMMARY = "Bash completion for btrfsprogs"
DESCRIPTION = "bash command line completion support for btrfsprogs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-bash-completion-6.3-2.2.aarch64.rpm"
RPM_HASH = "7071a2c3224e3e313b590e9374c8dc28748ed6438a9eb1c669617f792ad94ce7e283052d18f6f8af25406c69a499cbeb55dd11c1335ab235bd8046b592adf6f5"

RPROVIDES:${PN} += "btrfsprogs-bash-completion"

RDEPENDS:${PN} += "bash-completion \
btrfsprogs"

inherit rpm
