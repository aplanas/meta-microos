SUMMARY = "Bash Completion for hugo"
DESCRIPTION = "The official bash completion script for hugo, generated during the build."
LICENSE = "Apache-2.0"

PV = "0.116.0"

RPM_NAME = "hugo-bash-completion-0.116.0-1.1.noarch.rpm"
RPM_HASH = "53b3f3a8bef95883d419143a3866470e9bf1fdc245464f7f3dd90bd578c9e5f058740f518db961b14496d0360db13121787a766f6b2e81308d18c3df29b6c12b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hugo-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
