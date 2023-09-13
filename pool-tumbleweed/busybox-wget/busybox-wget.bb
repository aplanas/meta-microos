SUMMARY = "Busybox applets replacing wget"
DESCRIPTION = "This package contains the symlinks to replace wget with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-wget-1.36.1-30.1.noarch.rpm"
RPM_HASH = "1bbaa736253cbd40ec1b9d935b2be32ddffbdee586283345b9a739944669bff71ce720bbd1faa256f93bf13e58f50784a8512f247bd9ed415522f5812cc508fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-wget"

RDEPENDS:${PN} += "busybox"

inherit rpm
