SUMMARY = "Bash Completion for lxd"
DESCRIPTION = "Bash command line completion support for lxd."
LICENSE = "Apache-2.0"

PV = "5.16"

RPM_NAME = "lxd-bash-completion-5.16-1.1.noarch.rpm"
RPM_HASH = "849d1a6ccb889eb21d562ad1b9a8b814c1268fc0447972189b5de30fab8821086f357aff14a83d1c57726fcdce252769d64bcc4d05bf1354b80c25dfdadaece7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxd-bash-completion"

RDEPENDS:${PN} += "lxd"

inherit rpm
