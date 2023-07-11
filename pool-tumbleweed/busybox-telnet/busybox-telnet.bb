SUMMARY = "Busybox applets replacing telnet"
DESCRIPTION = "This package contains the symlinks to provide telnet with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-telnet-1.36.1-27.1.noarch.rpm"
RPM_HASH = "3da83c0971ea9c897682c445b3b712099bf61627ab37730e8036a4fead0465c8f161a2482837bc19abef8bf2f41baa6136ecb072fbb477e187047398533505f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-telnet"

RDEPENDS:${PN} += "busybox"

inherit rpm
