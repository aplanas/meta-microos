SUMMARY = "Bash Completion for salt"
DESCRIPTION = "Bash command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-bash-completion-3006.0-4.1.noarch.rpm"
RPM_HASH = "7956db26053cde74cd4270913a68d33e8c68052512d89367c563eab5ae6adb8af894d9ecad07848e6e4194dc3597d29f5440629838d51846b77100f29dd61855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-salt-bash-completion \
salt-bash-completion"

RDEPENDS:${PN} += "bash-completion \
salt"

inherit rpm
