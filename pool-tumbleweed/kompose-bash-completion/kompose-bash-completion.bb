SUMMARY = "Bash Completion for kompose"
DESCRIPTION = "The official bash completion script for kompose, generated during the build."
LICENSE = "Apache-2.0"

PV = "1.30.0"

RPM_NAME = "kompose-bash-completion-1.30.0-1.1.noarch.rpm"
RPM_HASH = "c978911b6dcbc581f3a56f347266aa2d4c26dd7adb4a2e047688ac15106ad598c699b5c7c878b48aa4571fbd2e6658392a5e92d6c73b4058d291c7aa76e73050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kompose-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
