SUMMARY = "Bash completion for cpupower"
DESCRIPTION = "bash command line completion support for cpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "cpupower-bash-completion-6.4.12-4.23.noarch.rpm"
RPM_HASH = "b94d5835c71812bca4f6c304287f0b371fc9eafddcd5dfa55eaa02f5e562692e5796943435aab5aeb8b4d620acb119c1fa25b99856424f24d3f8bc496c63565c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpupower"

inherit rpm
