SUMMARY = "Bash completion for cpupower"
DESCRIPTION = "bash command line completion support for cpupower."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "cpupower-bash-completion-6.3.9-4.15.noarch.rpm"
RPM_HASH = "703f4c6ab83461827d6ec270d6b915e5812a35f2fc5a9e2274028376671b31d0e6d7a0da70c95c1cd8d0f28e4d409dd21f3d4acee212ff25e7673951de51a175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpupower"

inherit rpm
