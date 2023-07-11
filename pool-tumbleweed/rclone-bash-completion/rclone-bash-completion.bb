SUMMARY = "Bash Completion for rclone"
DESCRIPTION = "Bash command line completion support for rclone."
LICENSE = "MIT"

PV = "1.63.0"

RPM_NAME = "rclone-bash-completion-1.63.0-1.1.noarch.rpm"
RPM_HASH = "197b3d89a37193c28cb146e2933ad47d565d1b4e2e483a1ee274979c57ff55b97ef88232edb4d6fdc9d5c3cf49c4b6cf849b61a7b5864e219db265c0a1dccd0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-bash-completion"

RDEPENDS:${PN} += "rclone"

inherit rpm
