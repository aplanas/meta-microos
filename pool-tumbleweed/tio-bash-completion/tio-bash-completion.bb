SUMMARY = "Bash Completion for tio"
DESCRIPTION = "Bash completion script for tio."
LICENSE = "GPL-2.0-or-later"

PV = "2.6"

RPM_NAME = "tio-bash-completion-2.6-1.1.noarch.rpm"
RPM_HASH = "be8485541d89e2c627baf988bfabbe057a3cc8d36428c14804dc6f215219aadfcdc0393a95bcf1664ccc977715b9ec17e0f8ea35d4defee3007a49cd08439316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tio-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tio"

inherit rpm
