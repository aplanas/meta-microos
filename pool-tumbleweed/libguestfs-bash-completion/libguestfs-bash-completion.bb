SUMMARY = "Bash tab-completion scripts for libguestfs tools"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for guestfish, guestmount and various virt-* tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-bash-completion-1.50.1-4.1.noarch.rpm"
RPM_HASH = "ef225f93a430ab3e6cb890d7281b4162c3c0cd4d0b4cb8b1cb5396c4b859cb45d46aa3e070bd7be92dc8d03daa5e4abda3543dab18b6700432555d74e47e20fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
