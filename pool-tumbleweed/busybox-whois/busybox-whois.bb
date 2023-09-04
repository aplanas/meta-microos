SUMMARY = "Busybox applets replacing whois"
DESCRIPTION = "This package contains the symlinks to replace whois with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-whois-1.36.1-28.1.noarch.rpm"
RPM_HASH = "d1d4e63b060f1cd9ca5f539ca27112e293b023ce61513ee771bc8099f00486604d7d805dfe07599dcbddac88abc8cf125d2311da97ea0f10d54060786c40f02d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-whois"

RDEPENDS:${PN} += "busybox"

inherit rpm
