SUMMARY = "Busybox applets replacing hostname"
DESCRIPTION = "This package contains the symlinks to replace hostname with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-hostname-1.36.1-27.1.noarch.rpm"
RPM_HASH = "b0bcccd263ac03084b21b653743cb9ea940fb64b45bc6fdd2ab094474479bbec3f1d0c10504563602a25dbfb747cb20df81b607fe47213e375fb7fd1c54219f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/hostname \
busybox-hostname"

RDEPENDS:${PN} += "busybox"

inherit rpm
