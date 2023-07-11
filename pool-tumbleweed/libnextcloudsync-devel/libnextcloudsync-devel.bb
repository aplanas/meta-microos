SUMMARY = "Development files for the Nextcloud synchronisation library"
DESCRIPTION = "Development files for the Nextcloud Desktop Client synchronisation \
library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libnextcloudsync-devel-3.9.0-3.1.aarch64.rpm"
RPM_HASH = "4e09337e64160eeab19e6b008a463a94ea1583b655c71a9c85679aaf8e1b5c2dbaee5316dabb5e61fe02867adbf7f438108261b4c56bed319617bbae96c1beab"

RPROVIDES:${PN} += "libnextcloudsync-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libnextcloud-csync.so.0 \
libnextcloudsync.so.0 \
libnextcloudsync0 \
libstdc++.so.6"

inherit rpm
