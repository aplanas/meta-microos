SUMMARY = "Development files for the Nextcloud synchronisation library"
DESCRIPTION = "Development files for the Nextcloud Desktop Client synchronisation \
library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "libnextcloudsync-devel-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "ce3a188a941f5de4b020221a9c5eff6e6d9af7363c93be79c4ba39aff38baf70c652fdcbfca5205d0c3fc673dd28dffbdcc7a64c6da942c2ac5edc639756b382"

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
