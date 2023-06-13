SUMMARY = "Bash completion for redminecli"
DESCRIPTION = "This package contains the bash completion command for redminecli."
LICENSE = "CECILL-B"

PV = "1.3.0"

RPM_NAME = "redminecli-bash-completion-1.3.0-1.10.noarch.rpm"
RPM_HASH = "9c5279fb2d063211add9fe7876f2a119e1fe5d2a607eaf48a7a51b4eae388cd985873122d420302bae57b18d8242270cdc51d4bff9cc85c09a75aa17c182d3d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redminecli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
redminecli"

inherit rpm
