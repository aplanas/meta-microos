SUMMARY = "Bash Completion for conftest"
DESCRIPTION = "Bash command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.45.0"

RPM_NAME = "conftest-bash-completion-0.45.0-1.1.noarch.rpm"
RPM_HASH = "0cd318cc49de188ded74453cf29c697fe6b285f93ccfd1542522b612b50cff11c4cbc6a9005f59ada6258ba3372b4cbba0eff31b417c4d4e161c8283f5d75eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-bash-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
