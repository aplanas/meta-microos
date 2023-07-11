SUMMARY = "Bash Completion for conftest"
DESCRIPTION = "Bash command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.43.1"

RPM_NAME = "conftest-bash-completion-0.43.1-1.1.noarch.rpm"
RPM_HASH = "d391ef9a93b81e16af78a72726d508fc32f11876b59554c68039bf0a5595dfd5b6ddcca1622f1e94acce602c5db2018743f98d6bc5073c73a09dddc5c99ca3c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-bash-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
