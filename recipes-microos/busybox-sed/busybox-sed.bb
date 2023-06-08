SUMMARY = "Busybox applets replacing sed"
DESCRIPTION = "This package contains the symlinks to replace sed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-sed-1.36.0-26.3.noarch.rpm"
RPM_HASH = "ce9b27fe775650e5aa4cdcc7f11fea1bdb186d3c99ce355db027f8ec1bc05e40a73ff39d6bf20d79e7dc9a1abcf374a2bb27d429e46915cfca9bcc6f336bf07c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/sed busybox-sed"
RDEPENDS:${PN} += "busybox"

inherit rpm
