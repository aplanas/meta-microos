SUMMARY = "Busybox applets replacing whois"
DESCRIPTION = "This package contains the symlinks to replace whois with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-whois-1.36.0-26.3.noarch.rpm"
RPM_HASH = "04b5a08500b5eceafee6fde4b2f2ec00da8b20cbcd73479acb4f3ae01c10b3301a4c917619c625093091586e3daebe6a1ecfbe4c35acde2999ec19461c3b9547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-whois"
RDEPENDS:${PN} += "busybox"

inherit rpm
