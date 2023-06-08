SUMMARY = "Bash Completion for cpustat"
DESCRIPTION = "Bash completion script for cpustat."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.15"

RPM_NAME = "cpustat-bash-completion-0.02.15-1.8.noarch.rpm"
RPM_HASH = "87f0c2bf903c9ab34868d501b718dc137ed6d36124dc19be2eddc56c92ccd014b34176c8662d647b1171e980fdac9a7c3031a01cee37cd3b4b64ce0ea3d8a67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpustat-bash-completion"
RDEPENDS:${PN} += "bash-completion cpustat"

inherit rpm
