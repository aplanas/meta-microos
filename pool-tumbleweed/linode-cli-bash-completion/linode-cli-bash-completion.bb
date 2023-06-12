SUMMARY = "Bash completion for linode-cli"
DESCRIPTION = " \
Bash completion files for linode-cli"
LICENSE = "BSD-3-Clause"

PV = "5.25.0"

RPM_NAME = "linode-cli-bash-completion-5.25.0-1.4.noarch.rpm"
RPM_HASH = "7c5b9b9a60a2e40324f737a4abccabdebd1f6efecc56fb244b3585674319f03f8594bb6ab4e24f858c2d28319e7233c4aea9e853364ebad7e423962f3216fc98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linode-cli-bash-completion"
RDEPENDS:${PN} += ""

inherit rpm
