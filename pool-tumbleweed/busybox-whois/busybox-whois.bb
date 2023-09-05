SUMMARY = "Busybox applets replacing whois"
DESCRIPTION = "This package contains the symlinks to replace whois with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-whois-1.36.1-29.1.noarch.rpm"
RPM_HASH = "869a0e1edb256f4dd340614976532520e3be8bfa08e1473984e4c67432a890bdfd2427fb1a471b3eb509f5f9e34e3dccc84b7a2dc7456764410c45dd3b05e4b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-whois"

RDEPENDS:${PN} += "busybox"

inherit rpm
