SUMMARY = "Bash tab-completion scripts for libguestfs tools"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for guestfish, guestmount and various virt-* tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-bash-completion-1.50.1-3.1.noarch.rpm"
RPM_HASH = "88899e9df9f9e10c4c46b23adedc08a2546eab6c86f36591cc547df42fb264be7ce500b60909f5485da759650e28ea89afc9d29f028494bb36929e96a1568393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
