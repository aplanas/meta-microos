SUMMARY = "Bash completion for distrobox"
DESCRIPTION = "Bash command line completion support for distrobox."
LICENSE = "GPL-3.0-only"

PV = "1.5.0"

RPM_NAME = "distrobox-bash-completion-1.5.0-1.1.noarch.rpm"
RPM_HASH = "7e6849eae9c4eb1c92bb6ceaa5e4cd789472a11a8d98651f574f146856ec44c01dc8aeba7091afd336b284712e241b9469f8c01799bc391d017a102c353fdab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distrobox-bash-completion"

RDEPENDS:${PN} += "bash-completion \
distrobox"

inherit rpm
