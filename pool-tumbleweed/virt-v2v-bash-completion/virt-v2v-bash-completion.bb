SUMMARY = "Bash tab-completion for virt-v2v"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for virt-v2v."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "virt-v2v-bash-completion-2.2.0-1.1.noarch.rpm"
RPM_HASH = "b10816027a79c1e35f8974f78e675ad52270281cd541172eb5beaef840d8d8b64375a38dc7c573287e5e4c9022e38b22ea4cf903701db67b00360b0c46b15d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-v2v-bash-completion"

RDEPENDS:${PN} += "bash-completion \
virt-v2v"

inherit rpm
