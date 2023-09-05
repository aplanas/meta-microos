SUMMARY = "Busybox applets replacing traceroute"
DESCRIPTION = "This package contains the symlinks to replace traceroute with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-traceroute-1.36.1-29.1.noarch.rpm"
RPM_HASH = "63f1aff49b3dca939b56299e0d02d97c12b752f7d123d9a782b544f0681ef2a01a42a9ee4fca744fa534089e4e603271cf6cdb1efb9a4625ebfde402d62b23bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-traceroute"

RDEPENDS:${PN} += "busybox"

inherit rpm
