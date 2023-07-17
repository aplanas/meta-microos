SUMMARY = "Bash completion for cpupower"
DESCRIPTION = "bash command line completion support for cpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "cpupower-bash-completion-6.4.2-4.16.noarch.rpm"
RPM_HASH = "4cee1671055c2dc72a10d233fa7ce8c8cc8eb3cb18b3f43acb7dbec6b4f9c7d4d5e38a6aa45d8afdc40f17e92ef27996ef73d48497036b22ac63302119945434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpupower"

inherit rpm
