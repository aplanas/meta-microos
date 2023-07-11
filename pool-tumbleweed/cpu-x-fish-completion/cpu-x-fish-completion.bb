SUMMARY = "Bash completion for cpu-x"
DESCRIPTION = "Shell completion definitions from cpu-x for cpu-x."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-fish-completion-4.5.3-1.2.noarch.rpm"
RPM_HASH = "9c59f2b43b90d834aeac5ad3a922600220cb98c6e5c55112766fd19ad6ca11fd5a2638e943d751cc1b70dce8bc11a4722f859ea54c87b594a4f02282710b1f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpu-x-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
