SUMMARY = "Bash Completion for swww"
DESCRIPTION = "Bash command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.7.3"

RPM_NAME = "swww-bash-completion-0.7.3-1.1.noarch.rpm"
RPM_HASH = "6bb9310fa87215abf695c546973bc9f4b15e8b2fef4d92f9f6940fbe05d2d710894fddb1b9476f4b50cc0055210c1790f2b2f39b4441672872e81d2e0f142808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
