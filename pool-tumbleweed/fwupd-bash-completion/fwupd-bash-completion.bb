SUMMARY = "Bash completion for fwupd"
DESCRIPTION = "This package contain the bash completion command for the device firmware updater daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.16"

RPM_NAME = "fwupd-bash-completion-1.8.16-2.1.noarch.rpm"
RPM_HASH = "e865d9cf72a407f4f419a6fed964ffb8fa4dd05f8cad30eaccab09b4fa8845ac0ea34920662276cd7eee9991e8dbfee553199f7c77b6ffdd105b51dee419660d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fwupd"

inherit rpm
