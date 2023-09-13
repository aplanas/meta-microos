SUMMARY = "Busybox applets replacing sendmail"
DESCRIPTION = "This package contains the symlinks to replace sendmail with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sendmail-1.36.1-30.1.noarch.rpm"
RPM_HASH = "06cb7a505f6decbed2fcf22934dd57050cb34a21ab157e08f9976961ce5193fba782ef746985941105eb7970b6566acaa454072d7c51af28acf1fd1008956488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sendmail \
smtp-daemon"

RDEPENDS:${PN} += "busybox"

inherit rpm
