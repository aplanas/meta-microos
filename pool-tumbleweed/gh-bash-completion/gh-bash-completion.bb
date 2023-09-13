SUMMARY = "Bash Completion for gh"
DESCRIPTION = "Bash command line completion support for gh."
LICENSE = "MIT"

PV = "2.34.0"

RPM_NAME = "gh-bash-completion-2.34.0-1.1.aarch64.rpm"
RPM_HASH = "1c27a7891f10b9fcb7952713a72ae8f814fadb2a500e2ec1945515a16ad15eb785d3cc2d7c7810f5e669d38bc689555c9fb2a16bf6d7703ea861c36f128a8a8f"

RPROVIDES:${PN} += "gh-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gh"

inherit rpm
