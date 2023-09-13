SUMMARY = "Bash Completion for timoni"
DESCRIPTION = "Bash command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "timoni-bash-completion-0.12.1-1.1.noarch.rpm"
RPM_HASH = "7c0847e03c724532cfc87cc378d397409512f26294f83e1f54295692777c59cd337c0ecda5e8960a3853de0939ee44c46498315f1f6f80f1c15162129305f2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-bash-completion"

RDEPENDS:${PN} += "bash-completion \
timoni"

inherit rpm
