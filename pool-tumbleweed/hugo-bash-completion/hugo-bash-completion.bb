SUMMARY = "Bash Completion for hugo"
DESCRIPTION = "The official bash completion script for hugo, generated during the build."
LICENSE = "Apache-2.0"

PV = "0.112.6"

RPM_NAME = "hugo-bash-completion-0.112.6-1.1.noarch.rpm"
RPM_HASH = "8c72b19fb070f0ae6aae711ae350a9d03ad5504a0a3dbffafe6b987531c1adad86b352788e8419f60d098748f1f3d4a91ccc77e5336cad92f640890d36b18a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hugo-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
