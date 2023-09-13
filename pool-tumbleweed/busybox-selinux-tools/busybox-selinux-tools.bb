SUMMARY = "Busybox applets replacing selinux-tools"
DESCRIPTION = "This package contains the symlinks to provide selinux-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-selinux-tools-1.36.1-30.1.noarch.rpm"
RPM_HASH = "29dadc34ca66711d6dfe78c3f358ebfac730f392b5a8eea78dfaff9324378203faa161b03a2be7b7c5c76799205209951548d73ffb1aba980fd41d15018f4a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-selinux-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
