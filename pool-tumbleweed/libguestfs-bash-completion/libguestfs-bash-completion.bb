SUMMARY = "Bash tab-completion scripts for libguestfs tools"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for guestfish, guestmount and various virt-* tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-bash-completion-1.50.1-4.2.noarch.rpm"
RPM_HASH = "63957fd5b2f3dcf66b2b23876b1cd5574a0b2582391aee6242412c6dfd2609bcbfa1540e3f7bc06f77a46c1af7e4705ace51f290b6bd2a43918a83790756b0e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
