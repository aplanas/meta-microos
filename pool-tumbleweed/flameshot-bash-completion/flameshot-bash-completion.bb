SUMMARY = "Bash Completion for flameshot"
DESCRIPTION = "Bash completion script for flameshot's CLI."
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-bash-completion-12.1.0-2.2.noarch.rpm"
RPM_HASH = "ddc16384576a413c19710e2d85b709e1f6794bf68917fed63fe0ae372856f646e14b864d34968a8da801571dec599420c425a084c2e7d68f0e9bd48f4fe44533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-bash-completion"

RDEPENDS:${PN} += "bash-completion \
flameshot"

inherit rpm
