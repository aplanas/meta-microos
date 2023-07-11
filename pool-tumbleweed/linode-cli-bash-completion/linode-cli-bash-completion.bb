SUMMARY = "Bash completion for linode-cli"
DESCRIPTION = " \
Bash completion files for linode-cli"
LICENSE = "BSD-3-Clause"

PV = "5.25.0"

RPM_NAME = "linode-cli-bash-completion-5.25.0-1.6.noarch.rpm"
RPM_HASH = "edac07e163ee4c20f722f6f1f9062f93919a2e218cfeb784d49dbcd5d3363d9b2c15e1e872673938579581c1aeac6fddfd5323105d3a9d452c54211d3f0ef74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linode-cli-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
