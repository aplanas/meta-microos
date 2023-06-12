SUMMARY = "Bash completion for fwupd"
DESCRIPTION = "This package contain the bash completion command for the device firmware updater daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "fwupd-bash-completion-1.8.12-1.3.noarch.rpm"
RPM_HASH = "89406fa3aea7bedf53f5698f2c655b5ce31ef33d1805bc2b747c054b2ee8bbc96a4d0f47fdbb185af04c68557957f88d4bc887379b846a47b075fd28d40559be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-bash-completion"
RDEPENDS:${PN} += "bash-completion \
fwupd"

inherit rpm
