SUMMARY = "Busybox applets replacing traceroute"
DESCRIPTION = "This package contains the symlinks to replace traceroute with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-traceroute-1.36.1-28.1.noarch.rpm"
RPM_HASH = "10929e2fc9868c4e0e4afce56e99ef52c044b082f737bff8c033b3546e3ecf02657569da64a332b6930c037d624022c77134d962213a21a03563430116ca1322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-traceroute"

RDEPENDS:${PN} += "busybox"

inherit rpm
