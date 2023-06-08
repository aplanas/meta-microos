SUMMARY = "Bash completion for distrobox"
DESCRIPTION = "Bash command line completion support for distrobox."
LICENSE = "GPL-3.0-only"

PV = "1.4.2.1"

RPM_NAME = "distrobox-bash-completion-1.4.2.1-3.1.noarch.rpm"
RPM_HASH = "f2e39de5ea4a7ee7e6483edbba999b3b8e42c233285bb434b06766cf8bd0a21a0978c77e02a2bdcd19e9407b2812c87b0d0b5bacba8f3afc0e07557fd73b6cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distrobox-bash-completion"
RDEPENDS:${PN} += "bash-completion distrobox"

inherit rpm
