SUMMARY = "Bash tab-completion scripts for guestfs-tools"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for the virt-* tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "guestfs-tools-bash-completion-1.50.1-1.2.noarch.rpm"
RPM_HASH = "5d87f7d95ec97b6bb2e4ffadb1ea375988008945ec77a5863aaa5190e25745a82d9071613101c7345da661f266b9ac2bbac8b590304a74509b46d2fea1dd9c76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guestfs-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion \
guestfs-tools"

inherit rpm
