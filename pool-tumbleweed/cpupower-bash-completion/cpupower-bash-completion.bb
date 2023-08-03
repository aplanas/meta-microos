SUMMARY = "Bash completion for cpupower"
DESCRIPTION = "bash command line completion support for cpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "cpupower-bash-completion-6.4.6-4.19.noarch.rpm"
RPM_HASH = "ca3dff8dfafc1406dfea1f8e48d4e8750b4a2ac0c210904a1b7412e1426f9e8ef531ba5c50352b326f5f9f4e83631629f1ef57c78bc7516cbaa5d60866562247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpupower"

inherit rpm
