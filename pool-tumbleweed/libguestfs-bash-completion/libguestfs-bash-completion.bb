SUMMARY = "Bash tab-completion scripts for libguestfs tools"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for guestfish, guestmount and various virt-* tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-bash-completion-1.50.1-3.3.noarch.rpm"
RPM_HASH = "01263701b05ac9fcdbce8f7c321295e7717b9f478fa59e221414e1b7dc09d4d813683ff2ee7ab2282c11a96561c5caa4c0189d14ab9967cb216ee083819b69c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
